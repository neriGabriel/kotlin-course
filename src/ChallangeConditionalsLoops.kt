fun main(args: Array<String>) {
    val books = arrayListOf("Programming with head", "Game of thrones", "Shingeky no kyojin");
    for(book in books) {
        if(book.contains('e')) {
            for(char in book)
                println(char);
        }
        println()
    }
}