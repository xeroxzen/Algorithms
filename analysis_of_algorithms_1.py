# -*- coding: utf-8 -*-
"""
Created on Tue Apr 12 10:16:23 2022

@author: Andile Jaden Mbele
"""

def get_squared_nums(nums):
    squared_nums = []
    for n in nums:
        squared_nums.append(n * n)
    return squared_nums

nums = [2, 4, 8, 9]
get_squared_nums(nums)
