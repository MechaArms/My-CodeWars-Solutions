/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 
The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
*/

//My Solution
//===========

fun abbrevName(name:String):String{
    var nam = name.split(" ")
    return (nam[0].get(0)+ "." + nam[1].get(0)).uppercase()
}

//Best Solution
//=============

fun abbrevName(name:String) = name.split(" ").map { it.first().toUpperCase() }.joinToString(".")
