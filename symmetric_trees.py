def are_symmetric(root1, root2):
    if root1 is None and root2 is None:
        return True
    elif((root1 is None) != (root2 is None)) or root1.val != root2.val:
        return False
    else:
        return are_symmetric(root1.left, root2.right) and are_symmetric(root1.right, root2.left)

def is_symmetric(root):
    if root is None:
        return True
    return are_symmetric(root.left, root.right)

# T(n) = O(n)
# S(n) = O(logn)