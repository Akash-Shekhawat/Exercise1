fun main(args: Array<String>) {

    var n= Aquarium("Akash","Shekhawat",22)

    println(Aquarium.printDetails())
    n.grade(60)

                    //Question2
    var a=Question2()
    println("Question 2")
    a.general(8,10)             //Part1,3
    a.general(5.5,10.8)         //Part2
    a.general("To The","New")   //Part4
    a.general("To","The","New") //Part5
}

//Question 1: Write a program to print your Firstname,LastName & age using init block,companion object.

class Aquarium (var fname:String,var lName:String,var Age:Int) {
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