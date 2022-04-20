"""
Given an integer n representing the number pf courses (courses are labeled from 0 to n - 1), and an array prerequisites where prerequisites[i] = [a, b] means that you first need to take the course a, determine if it's possible to finish all the courses.

input:
n = 6
prerequisites = [[0,1],[3,0],[1,3],[2,1],[4,1],[4,2],[5,3],[5,4]]
output: false

"""

# Implement DFS using set
def dfs(graph, vertex, path, order , visited):
    path.add(vertex)
    for neighbor in graph[vertex]:
        if neighbor in path:
            return False
        if neighbor not in visited:
            visited.add(neighbor)
            if not dfs(graph, neighbor, path, order, visited):
                return False
    path.remove(vertex)
    order.append(vertex)
    return True

# use topological sort
def top_sort(graph):
    visited = set()
    path = []
    order = []
    for vertex in graph:
        if vertex not in visited:
            visited.add(vertex)
            dfs(graph, vertex, path, order, visited)
    return order[::-1]

def course_schedule(n, prerequisites):
    graph = [[] for i in range(n)]
    for pre in prerequisites:
        graph[pre[1]].append(pre[0])
    visited = set()
    path = set()
    order = []
    for course in visited:
        visited.add(course)
        if not dfs(graph, course, path, order, visited):
            return False
    return True

# T(n , m) = O(n + m)
# S(n, m) = O(n + m)
        