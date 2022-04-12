# Linear search

def linear_search(array, n, x):
    # Going through the array sequentially
    for i in range(0, n):
        if array[i] == x:
            return i
    return -1

array = [2, 5, 10, 7, 3, 5, 4, 6, 1, 9]

x = 1
n = len(array)
result = linear_search(array, n, x)
if result == -1:
    print("Element not found")
else:
    print("Element found: ", result)
