/*
You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.
*/

//My solution
//===========
fun smallEnough(a : IntArray, limit : Int) : Boolean {
    for(i in a){
        if(i > limit){
            return false
        }
    }
    return true
}

//Best Solution
//=============
fun smallEnough(a: IntArray, limit: Int) = a.all { it <= limit }
