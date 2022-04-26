from Common.Node import Node


class DoubleLinkedList:

    def __init__(self):
        self.root = None

    def insert_at_begin(self, value):
        node = Node(value, self.root)
        self.root.setPrev(node)
        node.set_next(self.root)
        self.root = node

    def insert_at_end(self, value):
        node = self.traverse(-1)
        new_node = Node(value,None,node)
        node.set_next(new_node)

    def insert_at_index(self,value,index):
        node = self.traverse(index)
        new_node = Node(value, node, node.get_prev())
        node.set_next(new_node)
        node.set_prev(new_node)

    def traverse(self, index) -> Node:
        root = self.root
        current_index = 1
        while root is not None and root.get_next() is not None :
            if current_index is index:
                break
            root = root.get_next()
        return root

    def __str__(self):
        root = self.root
        value:str = ''
        while root is not None:
            value += root.value
            if root.get_next() is not None and root.get_next().get_prev() is root:
                value += ' <-> '
            root = root.get_next()
        return value

    