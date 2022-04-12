def kth_largest(arr, k):
    for i in range(k-1):
        arr.remove(max(arr))
    return max(arr)

# Time Complexity
# T(n, k) = (k - 1) * 2n + n
# T(n, k) = 2kn - n = O(kn)