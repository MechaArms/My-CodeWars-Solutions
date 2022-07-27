/*
Introduction
The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20
*/

fun century(year: Int): Int {
    var century = Math.ceil((year/100).toDouble())
    var remain = year % 100;

    if(remain > 0) {
        century++;
    }
    return century.toInt()
}
