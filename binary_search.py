# binary search function
def binary_search(L, x, low, high):
    # Repeat until the pointers low and high meet each other
    while low <= high:
        mid = low + (high - low) // 2
        if L[mid] == x:
            return mid
        elif L[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return -1

array = [1, 2, 3, 4, 5, 6, 9, 10]
x = 4

result = binary_search(array, x, 0, len(array) -1)

if result != -1:
    print("Element is present at index " + str(result))
else:
    print("Element is not present")
