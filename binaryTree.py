# Binary Tree

from tkinter.messagebox import NO


class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key 

    # Traverse preorder
    def traversePreOrder(self):
        print(self.val, end=' ')
        if self.left:
            self.left.traversePreOrder()
        if self.right:
            self.right.traversePreOrder()

    # Traverse in order
    def traverseInOrder(self):
        if self.left:
            self.left.traverseInOrder()
        print(self.val, key=' ')
        if self.right:
            self.right.traverseInOrder()

    # Traverse postorder
    def traversePostOrder(self):
        if self.left:
            self.left.traversePostOrder()
        if self.right:
            self.right.traversePostOrder()
        print(self.val, end=' ')

root = Node(1)

root.left = Node(2)
root.right = Node(3)

root.left.left = Node(4)

print("Pre Order Traversal: ", end=" ")
root.traversePreOrder()

print("\nIn Order Traversal: ", end=' ')
root.traverseInOrder()

print("\nPost Order Traversal", end=' ')
root.traversePostOrder()