/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty. 
*/

//My Solution
//===========

package solution

class SmallestIntegerFinder {

  fun findSmallestInt(nums: List<Int>): Int {
    return nums.sorted()[0]
  }

}

//Best Solution
//=============

package solution

class SmallestIntegerFinder {
  fun findSmallestInt(nums: List<Int>) = nums.minOf { it }
}
