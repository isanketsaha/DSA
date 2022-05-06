# You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
# order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
# You may assume the two numbers do not contain any leading zero, except the number 0 itself.

# Input: l1 = [2,4,3], l2 = [5,6,4]
# Output: [7,0,8]
# Explanation: 342 + 465 = 807.

# Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
# Output: [8,9,9,9,0,0,0,1]

from typing import Optional
from DataStructures.Common.Node import Node
from DataStructures.LinkedList.SingleLinkedList import SingleLinkedList


class Solution:

    def __init__(self):
        self.root = None

    def addTwoNumbers(self):
        sll = SingleLinkedList()
        sll.insert_at_end(5)
        sll.insert_at_begin(1)
        sll.insert_at_begin(6)
        sll.insert_at_end(2)
        value = int(self.traverseReverse(sll.get_root()))
        self.root : Node= None
        prevNode = None
        while value > 0:
            rem = str(value % 10)
            value = value // 10
            currentNode = Node(rem)
            if self.root is None :
                self.root = currentNode
                prevNode = currentNode
            else :
                prevNode.next = currentNode
                prevNode = currentNode
        return self.root

    def traverseReverse(self, l1: Optional[Node]):
        if l1.get_next() is not None:
            return self.traverseReverse(l1.get_next()) + str(l1.get_data())
        else:
            return str(l1.get_data())


Solution().addTwoNumbers()
