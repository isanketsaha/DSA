from DataStructures.Common.Node import Node


class DoubleLinkedList:

    def __init__(self):
        self.root: Node = None

    def insert_at_begin(self, value):
        node = Node(value, self.root)
        node.set_next(self.root)
        if self.root is not None :
            self.root.set_prev(node)
        self.root = node

    def insert_at_end(self, value):
        node = self.traverse()
        if node is None :
            self.insert_at_begin(value)
        else :
            new_node = Node(value, None, node)
            node.set_next(new_node)

    def insert_at_index(self, value, index):
        node = self.traverse(index)
        new_node = Node(value, node, node.get_prev())
        node.get_prev().set_next(new_node)
        node.set_prev(new_node)

    def delete_at_begin(self):
        self.root = self.root.get_next()
        self.root.set_prev(None)

    def delete_at_end(self):
        node = self.traverse()
        second_last = node.get_prev()
        second_last.set_next(None)

    def delete_at_index(self, index):
        node = self.traverse(index)
        deleted_node = node.get_next()
        node.set_next(deleted_node.get_next())
        deleted_node.get_next().set_prev(node)

    def traverse(self, index: int = -1) -> Node:
        root = self.root
        current_index = 1
        while root is not None and root.get_next() is not None:
            if current_index is index:
                break
            root = root.get_next()
            current_index += 1
        return root

    def __str__(self):
        root = self.root
        value: str = ''
        while root is not None:
            value += str(root.get_data())
            if root.get_next() is not None and root.get_next().get_prev() is root:
                value += ' <-> '
            root = root.get_next()
        return value


dll = DoubleLinkedList()
dll.insert_at_end(12)
dll.insert_at_begin(8)
dll.insert_at_end(16)
dll.insert_at_index(10,2)
dll.delete_at_begin()
dll.delete_at_end()
print(dll)
