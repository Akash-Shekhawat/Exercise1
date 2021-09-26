fun main(args: Array<String>) {

    val n= Person("Akash","Shekhawat",22)

    println(Person.printDetails())
    n.grade(60)

                    //Question2
    val a=Question2()
    println("Question 2")
    a.general(8,10)             //Part1,3
    a.general(5.5,10.8)         //Part2
    a.general("To The","New")   //Part4
    a.general("To","The","New") //Part5

    /*
      *Question 6:
      * Write a program to create mutable list of Integer.
      *replace the second item in the list with new value. Print the list value.
     */
    val list: MutableList<Int> = mutableListOf<Int>(4,8,2,6,10)
    println("Original list is: $list")
    list.add(1,5)
    println("list after change value of second element is: $list")

    /*
    *Question 7:
    *Write a program to create mutable map.
    * print all the value and key of map.
    */

    val maplist: MutableMap<Int,String> = mutableMapOf<Int,String>(1 to "Abhishek",3 to "Captain Amarica",
        4 to "Iron Man" ,2 to "Shanu")

    for (key in maplist.keys) {
        println("Key = ${key}, Value = ${maplist[key]}")
    }
    /*
     *Question8:
     * Write a program to create HashSet. print all the value.
     */
    val num = hashSetOf<Int>(2,13,6,5,2,8)
    for (element in num){
        println(element)
    }
}

//Question 1: Write a program to print your Firstname,LastName & age using init block,companion object.

class Person (var fname:String,var lName:String,var Age:Int) {
    companion object Details{
        var name=" Akash"
        var lastName=" Shekhawat"
        var age=22
        fun printDetails(){
            println("Question 1 By Companion object")
            println(name)
            println(lastName)
            println(age)
        }
    }
    init {
        var firstName= fname
        var lastName= lName
        var age= Age
        println("Question 1 By init")
        println("$firstName $lastName with age $age is working with ttn")
    }


    //Question5:Write a function which take marks as an argument and return the the grade as follows:

    fun grade(marks:Int){
        println("Question 5")
        when (marks) {
            in 50..60 -> print("Good")
            in 61..70 -> print("Very Good")
            in 71..80 -> print("Excellent")
            in 81..100 -> print("Excellent")
            else -> {
                print("Retest")
            }
        }
        println(" ")
    }

}


 //Question2: Write a single program for following operation using overloading
class Question2{

    fun general(a:Int, b:Int){
        println("Sum of $a & $b = ${a+b}")
        println("Multiple of $a & $b = ${a*b}")
    }
    fun general(a:Double, b:Double){
        println("Sum of $a & $b = ${a+b}")
    }

    fun general(a:String, b:String){
        println("Sum of $a & $b = ${a+b}")
    }

    fun general(a:String, b:String,c:String){
        println("Sum of $a & $b = ${a+b+c}")
    }

}

