'''
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
'''

from collections import Counter

def find_it(seq):
    counts = list(Counter(seq).items())
    for x in counts:
        if x[1] % 2 != 0:
            return x[0]
    return None
    
    
from functools import reduce

def find_it(seq):
    return reduce(lambda x, y: x^y, seq)
