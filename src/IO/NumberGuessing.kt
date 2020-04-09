package IO

import java.util.*

fun main(args: Array<String>) {
    val number = Random().nextInt(100) + 1;
    var input: String?;
    var guess: Int = -1;

    while(guess != number) {
        println("Guess number between 1...100: ");
        input = readLine();

        if(input != null)
            guess = input.toInt();

        if(guess < number)
            println("Too low");
        else if(guess > number)
            println("To high");
        else
            println("You Won!");
    }
}