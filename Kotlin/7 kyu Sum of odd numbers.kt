/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
*/

//My Solution
//===========

fun rowSumOddNumbers(n: Int) = n * n * n

//My Clever Solution
//==================

fun rowSumOddNumbers(n: Int): Int { // n = 2
    var expo: Double = Math.pow(n.toDouble(), 3.0)
    return expo.toInt() // returns 8
}
