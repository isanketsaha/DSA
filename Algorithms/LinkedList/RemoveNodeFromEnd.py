# Remove Nth Node From End of List.
# Given the head of a linked list, remove the nth node from the end of the list and return its head.
# Input: head = [1,2,3,4,5], n = 2
# Output: [1,2,3,5]
from typing import Optional
from DataStructures.Common.Node import Node
from DataStructures.LinkedList.SingleLinkedList import SingleLinkedList


class Solution:

    def removeNthFromEnd(self, head: Optional[SingleLinkedList], n: int) -> Optional[Node]:
        self.traverseReverse(head.get_root(), n)
        return head

    def traverseReverse(self, head: Optional[Node], n: int):
        slow = fast = start = Node()
        slow.next = head

        for _ in range(n):
            fast = fast.next

        while fast.next:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return start.next

sll = SingleLinkedList()
sll.insert_at_begin(1)
sll.insert_at_end(2)
Solution().removeNthFromEnd(sll,1)