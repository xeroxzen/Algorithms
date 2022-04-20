# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 14:01:16 2022

@author: andil
"""

def depth_first_search(arr, target):
    if len(arr) == 0 or arr[0] > target or arr[-1] < target:
        return [-1, -1]
    start, end = -1, -1
    for i in range(len(arr)):
        if arr[i] == target:
            start = i
            break
    for i in range(len(arr)-1, -1, -1):
        if arr[i] == target:
            end = i
            break
    return [start, end]

# # T(n) = O(n)