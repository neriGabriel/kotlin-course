package Challenges

class Book(title: String, author: String, year: String) {
    var title: String;
    var author: String;
    var year: String;
    var borrowed: Boolean = false;

    init {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    fun lend() {
        this.borrowed = !this.borrowed;
    }

    fun show() {
        println("Title: ${this.title}");
        println("Author: ${this.author}");
        println("Year: ${this.year}");
    }
}

fun main(args: Array<String>) {
    var BookObject = Book("HP", "JK ROWLING", "1999");
    BookObject.show();

    println();
    println(BookObject.borrowed);
    BookObject.lend();
    println(BookObject.borrowed);
    BookObject.lend();
    println(BookObject.borrowed);
}