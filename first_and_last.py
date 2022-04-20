# Linear Search Approach

def first_and_last(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            start = i
            while i+ 1 < len(arr) and arr[i+1]== target:
                i += 1
            return [start, i]
    return [-1, -1]

arr = [1,2,3,4,5,5,5,6,7]
target = 5

# T(n) = O(n)