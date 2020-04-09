package Challenges

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 10;

    println("VALUE: ${random}");

    when(random) {
        in 1..10 -> println("RANGE 1..10")
        in 11..20 -> println("RANGE 11..20")
        in 21..30 -> println("RANGE 21..30")
        in 31..40 -> println("RANGE 31..40")
        else -> println("BIGGER THAN 40")
    }
}