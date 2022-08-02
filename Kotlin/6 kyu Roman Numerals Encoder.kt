/*
Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

encode(1000) // should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
*/

package romannumerals

fun encode(num: Int): String {
    val romanNumerals = mapOf(
        "M" to 1000,"CM" to 900,
        "D" to 500,"CD" to 400,
        "C" to 100,"XC" to 90,
        "L" to 50,"XL" to 40,
        "X" to 10,"IX" to 9,
        "V" to 5,"IV" to 4,
        "I" to 1
    )
    var number = num
    var str = ""
    for (i in romanNumerals) {
        while(number >= i.value) {
            str += i.key
            number -= i.value
        }
    }
    return str
}
