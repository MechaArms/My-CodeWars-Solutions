'''
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
'''
#graphic is a 1/4 of circle inside a square

import math

def square_area(a):
    PI = math.pi
    radius = (a*4) / (2*PI)
    return round(math.pow(radius,2),2)
