package Poo.Generics

//E = GENERIC TYPE
class GenericFunction<E>(vararg val items: E) {

    val elements = items.toMutableList();

    fun push(element: E) {
        elements.add(element);
        val list = arrayListOf("a", "Hello", "C");
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

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements);
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

    val stack2 = stackOf("Hi", "Hey", "Hello");
    for(i in 1..3) {
        println(stack2.pop());
    }
}