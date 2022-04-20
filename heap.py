# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 13:08:06 2022

@author: Andile Jaden Mbele
"""

def heapify(L, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2 
    
    if l < n and L[i] < L[l]:
        largest = l
    
    if r < n and L[largest] < L[r]:
        largest = r
    
    if largest != i:
        L[i],L[largest] = L[largest],L[i]
        heapify(L, n, largest)

def insert(array, new_num):
    size = len(array)
    if size == 0:
        array.append(new_num)
    else:
        array.append(new_num);
        for i in range((size//2)-1, -1, -1):
            heapify(array, size, i)

def delete_node(array, num):
    size = len(array)
    i = 0
    for i in range(0, size):
        if num == array[i]:
            break
        
    array[i], array[size-1] = array[size-1], array[i]

    array.remove(num)
    
    for i in range((len(array)//2)-1, -1, -1):
        heapify(array, len(array), i)
    
arr = []

insert(arr, 3)
insert(arr, 4)
insert(arr, 9)
insert(arr, 5)
insert(arr, 2)

print ("Max-Heap array: " + str(arr))

delete_node(arr, 4)
print("After deleting an element: " + str(arr))

