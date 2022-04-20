# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 14:04:47 2022

@author: Andile Jaden Mbele
"""

#Depth First Search Algorithm

def depth_first_search(graph, start, visited=None):
    if visited is None:
        visited = set()
    visited.add(start)
    
    print(start)
    
    for next in graph[start] - visited:
        depth_first_search(graph, next, visited)
    return visited

graph = {'0': set(['1', '2']),
         '1': set(['0', '3', '4']),
         '2': set(['0']),
         '3': set(['1']),
         '4': set(['2', '3'])}


depth_first_search(graph, '3')
# Depth First Search in Python

