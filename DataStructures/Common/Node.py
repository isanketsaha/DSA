class Node(object):

    def __init__(self, data=None, next_node: 'Node' = None, prev_node: 'Node' = None):
        self.data = data
        self.next = next_node
        self.prev = prev_node

    def get_data(self):
        return self.data

    def set_data(self, data):
        self.data = data

    def set_next(self, next: 'Node'):
        self.next = next

    def get_next(self) -> 'Node':
        return self.next

    def get_prev(self) -> 'Node':
        return self.prev

    def set_prev(self, prev: 'Node'):
        self.prev = prev
