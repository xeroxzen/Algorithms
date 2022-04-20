def generate(n):
    def rec(n, diff, comb, combs):
        if diff < 0 or diff > n:
            return
        elif n == 0:
            if diff == 0:
                combs.append(''.join(comb))
        else:
            comb.append('(')
            rec(n-1, diff+1,comb,combs)
            comb.pop()
            comb.append(')')
            rec(n-1, diff-1,comb,combs)
            comb.pop()
    combs = []
    rec(2*n, 0, [], combs)
    return combs

# T(n) = n
# T(n) = 2T(n-1)+1
# T(n) = 2(2T(n - 2) + 1) + 1
# T(n) = 4T(n - 2) + 3
# T(n) = 4(2T(n - 3) + 1) + 3
# T(n) = 8T(n - 3) + 7

# T(n) = 2^nT(n - n) + 2^n - 1
# T(n) = 2^nT(0) + 2^n - 1
# T(n) = 2^n * n + 2^n - 1
# T(n) = 0(n * 2^n)

# S(n) = 0(n * 2^n)