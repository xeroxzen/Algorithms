"""
If a station start reaches a negative amount at the index i, then all stations between start and i inclusive are invalid, we start again from i + 1

gas[start] < cost[start] => tje car directly stops, no other stations are involved.

gas[start] >= cost[start] => if the car reaches a negative amount of gas at the index i, all stations between start and i inclusive are invalid.
"""

def gas_station(gas, cost):
    remaining = 0
    prev_remaining = 0
    candidate = 0
    for i in range(len(gas)):
        remaining += gas[i] - cost[i]
        if remaining < 0:
            candidate = i + 1
            prev_remaining += remaining
            remaining = 0
    if candidate == len(gas) or remaining + prev_remaining < 0:
        return -1
    else:
        return candidate

# T(n) = O(n)
# S(n) = 4 = O(1)
 