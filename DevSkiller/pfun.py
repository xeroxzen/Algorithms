from functools import partial

def func(a,b,c):
    print(a*10 + b + c)
    return a * 10 + b + c


pfun = partial(func, 10)

assert pfun(5, 4) == 109