/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
*/

//My Solution
//===========

fun findShort(s: String): Int {
    val arr = s.split(" ")
    var x = 100
    for (i in arr){ 
       if (i.length < x){
           x = i.length
       }
    }
    return x 
}

//Best Solution
//=============

fun findShort(s: String): Int = s.split(" ").minOf{it.length}
