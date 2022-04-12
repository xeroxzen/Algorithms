"""
Given an integer n, generate all the valid combinations of n pairs of parentheses.

input:
n = 3
output:
["((()))", "(()())", "(())()", "()(())", "()()()"]

A combination that contains 1 type of parentheses is valid if every opening parentheses has its closing parentheses, and it doesn't have an unused opening parentheses before it
"""

# Solution using a Stack
def valid(combination):
    stack = []
    for par in combination:
        if par == '(':
            stack.append(par)
        else:
            if len(stack) == 0:
                return False
            else:
                stack.pop()
    return len(stack) == 0

"""
Validity Condition 1: Not trying to pop from an empty stack (otherwise it means that we found a closing parenthesis without an opening one from it)

Validity Condition 2: Stack must be empty at the end (otherwise it means opening parentheses that we didn't close)
"""


# Another solution 
def is_valid(combination):
    diff = 0
    for par in combination:
        if par == '(':
            diff += 1
        else:
            if diff == 0:
                return False
            else:
                diff -= 1
    return diff == 0


