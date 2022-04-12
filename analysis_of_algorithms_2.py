# -*- coding: utf-8 -*-
"""
Created on Tue Apr 12 10:47:21 2022

@author: Andile Jaden Mbele
"""

def check_duplicates(numbers):
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[i] == numbers[j]:
                print(numbers[i], " is a duplicate")
                break
            

numbers = [3, 6, 2, 4, 3, 6, 8, 9]

#T(n) = a * n^2 + b => O(n^2)

