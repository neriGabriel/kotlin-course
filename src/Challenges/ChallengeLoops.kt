package Challenges

fun main(args: Array<String>) {
    var sum: Long = 0L;

    for(i in 100..100000L)
        sum += i;

    println(sum);

}