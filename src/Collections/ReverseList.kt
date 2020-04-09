package Collections

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5);
    println(reverseList(list));
}

//HERE I DEFINE A FUNCTION THATS HAVE A PARAMETER TO BE TIPO OF LIST OF INTEGER AND RETURN A LIST OF INTEGER
fun reverseList(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>();
    for(i in 0..list.size - 1) {
        result.add(list.get(list.size-1-i));
    }
    return result;
}