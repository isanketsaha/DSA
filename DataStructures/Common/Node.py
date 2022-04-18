
class Node(object) :

    def __init__(self, data = None, next = None, prev = None):
        self.data = data
        self.next = next
        self.prev = prev

    def getData(self):
        return self.data

    def setData(self, data):
        self.data = data

    def setNext(self,next) :
        self.next = next

    def getNext(self):
        return self.next

    def getPrev(self):
        return self.prev

    def setPrev(self, prev):
        self.prev = prev