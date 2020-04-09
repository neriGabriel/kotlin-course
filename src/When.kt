fun main(args: Array<String>) {
    val mode: Int = 33;

    when(mode) {
        1 -> println("[MODE]: 1")
        2 -> println("[MODE]: 2")
        3 -> {
            println("[MODE]: 3")
            println("FINAL MODE")
        }
        else -> println("ELSE")
    }
}