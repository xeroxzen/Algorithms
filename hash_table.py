# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 12:10:20 2022

@author: Andile Jaden Mbele
"""
hash_table = [[], ] * 10

def check_prime(n):
    if n == 1 or n == 0:
        return 0
    
    for i in range(2, n//2):
        if n % i == 0:
            return 0
        
    return 1

def get_prime(n):
    if n % 2 == 0:
        n += 1
    while not check_prime(n):
        n += 2
        
    return n

def hash_func(key):
    capacity = get_prime(10)
    return key % capacity

def insert_data(key, data):
    index = hash_func(key)
    hash_table[index] = [key, data]
    
def remove_data(key):
    index = hash_func(key)
    hash_table[index] = 0
    
insert_data(123, "Falcon 9")
insert_data(432, "Falcon Heavy")
insert_data(213, "Starship")
#insert_data(276, "Delta IV")
insert_data(654, "Soyuz MS-15")


print("Original Hash Table")
print(hash_table)

remove_data(123)

print("Modified Hash Table")
print(hash_table)