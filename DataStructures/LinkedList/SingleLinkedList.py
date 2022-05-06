from DataStructures.Common.Node import Node



class SingleLinkedList:

    def __init__(self):
        self.root: Node = None

    def get_root(self):
        return self.root

    def insert_at_begin(self, value):
        newNode = Node(value)
        newNode.set_next(self.root)
        self.root = newNode

    def insert_at_end(self, value):
        node = self.traverse(-1)
        if node is not None:
            node.set_next(Node(value))
        else:
            self.insert_at_begin(value)

    def insert_at_index(self, value, index):
        if index == 1:
            self.insert_at_begin(value)
        else:
            node = self.traverse(index)
            if node is not None and node.next is not None and node.next.next is not None:
                next_node = node.next
                new_node = Node(value)
                node.set_next(new_node)
                new_node.set_next(next_node)
            else:
                self.insert_at_end(value)

    def delete_at_end(self):
        node = self.traverse(-1)
        if node is not None:
            node.set_next(None)
        else:
            print('List is Empty to perform delete operation')

    def delete_at_start(self):
        if self.root is not None :
            self.root = self.root.next
        else:
            print('List is Empty to perform delete operation')

    def delete_at_index(self,index):
        node = self.traverse(index)
        if node is not None and node.next is not None :
            node.set_next(node.get_next().get_next())
        else:
            node.set_next(None)

    def traverse(self, index):
        root = self.root
        prevNode = root
        current_index = 1
        while root is not None and root.next is not None:
            if current_index is index:
                break
            else:
                current_index += 1
                prevNode = root
                root = root.next
        return prevNode

    def __str__(self):
        list_value = ''
        root = self.root
        while root is not None:
            list_value += str(root.data)
            if root.next is not None:
                list_value += ' => '
            root = root.next
        return list_value

    def length(self):
        root = self.root
        length = 0
        while root is not None:
            length += 1
            root = root.next
        print(f'The Length of the linkedList is {length}')

