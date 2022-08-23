/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 
maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4));
// should be 6: listOf(4, -1, 2, 1)
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
*/

import kotlin.math.max

fun maxSequence(arr: List<Int>): Int {
    return arr.fold(Pair(0, 0)) { (current, max), x ->
        val nextCurrent = max(0, current + x)
        val nextMax = max(nextCurrent, max)

        Pair(nextCurrent, nextMax)
    }.second
}
