package Functions

import java.util.*

fun main(args: Array<String>) {
    println(getCurrentDate());
}

fun greeting() {
    println("Hello World By Function")
}

fun printStringWithSpaces(text: String) {
    for (char in text)
        print(char + " ");
    println();
}

fun getCurrentDate(): Date {
    return Date();
}