/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/

//My Solution
=============

package twotoone

fun longest(s1:String, s2:String):String {
    val word = s1 + s2
    val arr = word.toCharArray()
    val result = arr.distinct()
    
    return result.sorted().joinToString("")
}
  
//Best Solution
//=============

package twotoone

fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}
