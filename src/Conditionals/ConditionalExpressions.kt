package Conditionals

fun main(args: Array<String>) {
    val mode: Int = 4;

    val result = when (mode) {
        1 -> "Lazy Mode"
        2 -> "Fast Mode"
        2 -> "Super Hiper Fast Mode"
        4 -> {
            println("HAHA SUPER MEGA BLASTER MODEE")
            var i: Int = 10
        }
        else -> "It's not a mode"
    }

    val result2 = if(mode < 2) {
                    println("Mode less than 2")
                  } else {
                    println("Mode bigger than 2")
                  }

    print(result);
    print(result2);
}