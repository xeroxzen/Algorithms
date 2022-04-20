from collections import Counter

def are_anagrams(s1, s2):
    if len(s1) != len(s2):
        return False
    return Counter(s1) == Counter(s2)

s1 = "salesman"
s2 = "nameless"