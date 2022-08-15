/*
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.
*/

//My Solution
//===========

fun incrementString(str: String) : String {
    var numberZ = 0
    var wordsZ = ""
    
    var number = numberZ.toString() + str.filter({ it -> it.isDigit() })  // Filter only Digits From String
    var words = wordsZ + str.filter({ it -> it.isLetter() })              // Filter only Letters From String
 
    var incNumber: Int = number.toInt() + 1    // incrementing + 1
    var newNumber = incNumber.toString()       // transforming to string
    
    var contZero = number.length               // conting the numbers length
    contZero = contZero.toInt()
    contZero --                                // removing the extra zero
    
    val numWithZero = newNumber.padStart(contZero, '0') // add zero
    // println("'$numWithZero'") // '001'  
   
    val answer = words + numWithZero
        
    return "$answer"
}

//Clever Solution
//===============

fun incrementString(str: String) : String {
  val s = str.filter { !it.isDigit() }
  val d = str.filter { it.isDigit() }
  if (d.length == 0) return s + "1"
    
  val n = (d.toInt() + 1).toString()
  val digit = if (n.length < d.length) "0".repeat(d.length - n.length) + n else n
  return s + digit
}

//Best Solution
//=============

fun incrementString(str: String) : String {
    val i = str.takeLastWhile { it.isDigit() }
    return str.dropLast(i.length) + ((i.toIntOrNull() ?: 0) + 1).toString().padStart(i.length, '0')
}
