# Binary Search in Python using Recursion
def binary_search(L, x, low, high):
    if high >= low:
        mid = low + (high - low) // 2

        # if found at mid, then return it
        if L[mid] == x:
            return mid
        
        # Search the left half
        elif L[mid] > x:
            return binary_search(L, x, low, mid - 1)

        # Search the right half
        else:
            return binary_search(L, x, mid + 1, high)

    else:
        return -1

L = [3, 4, 5, 6, 7, 8, 9, 10]
x = 4

result = binary_search(L, x, 0, len(L)-1)

if result != -1:
    print("Element is present at index %d" % result)
else:
    print("Not found")