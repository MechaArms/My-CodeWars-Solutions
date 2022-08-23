/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces. 
*/

//My Solution
//===========

fun getCount(str : String) : Int {
    var line = str
    var vowels = 0
    
    for (i in 0..line.length - 1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            ++vowels
        }
    }
    return vowels
}

//Best Solution
//=============

fun getCount(str : String): Int = str.count { it in listOf('a','i','e','o','u') }
