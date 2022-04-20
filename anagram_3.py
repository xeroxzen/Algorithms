def are_anagrams(s1, s2):
    if len(s1) != len(s2):
        return False
    return sorted(s1) == sorted(s2) # T(n) = O(nlogn) + O(nlogn) + n
                                    # T(n) = O(nlogn)

s1 = "nameless"
s2 = "salesman"

str1 = "name"
str2 = "mane"