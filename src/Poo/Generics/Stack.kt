package Poo.Generics

//E = GENERIC TYPE
class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList();

    fun push(element: E) {
        elements.add(element);
    }

    fun pop(): E? {
        if(!isEmpty())
            return elements.removeAt(elements.size - 1);
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty();
    }
}

fun main(args: Array<String>) {
    val stack = Stack(1,2,3,4,5);
    println(stack.pop());
    println(stack.pop());
    println(stack.pop());
    println(stack.pop());
    println(stack.pop());
    println(stack.pop());
    println(stack.pop());
}