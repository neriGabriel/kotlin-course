package Loops

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i);
    }

    val list = listOf("Java", "Kotlin", "PHP");
    for(elements in list) {
        println(elements);
    }

    for((index, value) in list.withIndex()) {
        println("Element at $index is $value");
    }

    //NAMING LOOPS
    outer@ for(i in 1..10) {
        for ( j in 10..20) {
            if( i - j == 5)
                break@outer;
        }
    }
}