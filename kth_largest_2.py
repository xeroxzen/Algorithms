def kth_largest(arr, k):
    n = len(arr)
    arr.sort()
    return arr[n - k]

arr = [7, 3,5,9,1,0,4,2,8,7]
k = 2

# T(n) = O(nlogn)