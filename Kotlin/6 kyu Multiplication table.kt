/*
Your task, is to create NxN multiplication table, of size provided in parameter.
 
for example, when given size is 3:

1 2 3
2 4 6
3 6 9
for given example, the return value should be: [[1,2,3],[2,4,6],[3,6,9]]
*/

//My solution
//===========

package kata

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
      val table = Array(size) { IntArray(size) }
      for (i in 0..size - 1) {
        for (k in 0..size - 1) {
          table[i][k] = (i + 1) * (k + 1)
        }
      }
      return table
    }
}

//Best Solution
//=============

package kata

object KataSolution {
    fun multiplicationTable(size: Int) = Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
}
