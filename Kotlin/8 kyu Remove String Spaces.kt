/*
Simple, remove the spaces from the string, then return the resultant string. 
*/

fun noSpace(x: String): String {
    val filtered = x.filterNot { it.isWhitespace() }
 
    return filtered
}
