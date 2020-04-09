fun main(args: Array<String>) {
    /*IN KOTLIN arrays you cant change the values*/
    val array = arrayOf("Nova Odessa", "Americana", "Santa Barbara");
    val list = listOf("Banana", "Laranja", "Abacaixa");

    /*IN KOTLIN array list you can edit whatever you want*/
    val arrayList = arrayListOf("Onix", "Astra", "Vectra");

    //******************************************************//
    val elements = arrayOf("Banana", 1, 2, 3, 'C');
    val numbers = intArrayOf(1,2,3,4,5,6);

    println(elements[0]);

    elements[0] = "AÇAI";

    println(elements[0]);

    val anArray = arrayOf('A', 'B');
    val anotherAnyArray = arrayOf('C', 'D');
    val concatArrat = anArray + anotherAnyArray;


}