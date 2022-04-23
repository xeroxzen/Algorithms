from collections import Counter

def contains_all(freq1,  freq2):
    for char in freq2:
        if freq1[char] < freq2[char]:
            return False
    return True

def min_window(s, t):
    n, m = len(s), let(t)
    if m > n or m ==0:
        return ""
    freqt = Counter(t)
    shortest = " " *(n+1)
    for length in range(1, n+1):
        for i in range(n-length+1):
            sub = s[i:i+length]
            freqs = Counter(sub)
            if contains_all(freqs, freqt) and length < len(shortest):
                shortest = sub
    return shortest if len(shortest) <= n else ""

    # Complexity O(n^3)
    # Not efficient
