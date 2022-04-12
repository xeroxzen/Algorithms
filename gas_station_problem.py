"""
Given a circular list of gas stations, where we can go from a station i to station i + 1, and the last one goes  back to the first one, find the index of the station from where we start to be able to traverse all the stations and go back to the initial one withour running out of gas.

Note that:
> We can move only forward
> The gas tank starts empty
> gas[i] represents the amount of gas at the station i
> cost[i] represents the cost to go from  the station i to the next one
> the answer is guaranteed to be unique
> if the station we're searching for doesn't exist, return -1

input: 
gas = [1,5,3,3,5,3,1,3,4,5]
cost = [5,2,2,8,2,4,2,5,1,2]

output: 8
explanation: 
We can start from it and return back to it without running out of gas.

Algorithm
    For each station i:
        Start traversing from there
            If the car goes back to i:
                i is the right station, return it
"""

def can_traverse(gas, cost, start):
    n = len(gas)
    remaining = 0
    i = start
    started  = False
    while i != start or not started:
        started = True
        remaining += gas[i] - cost[i]
        if remaining < 0:
            return False
        i = (i + 1) % n
    return True

def gas_station(gas, cost):
    for i in range(len(gas)):
        if can_traverse(gas, cost, i):
            return i
    return -1

# T(n) = 0(n^2)
# S(n) = 0(1)n

