package Poo.OverrideRules

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.");
    }
}

open class KotlinCourse(): Course("Kotlin", 2000.00) {
    override fun learn() {
        super.learn();
        println("I'm one of the first people to learn KOTLIN");
    }
}

fun main(args: Array<String>) {
    val course = KotlinCourse();
    course.learn();
}