import java.util.*

fun main(args: Array<String>) {
        println("Hello, World!")
        var details=SingletonClass                          //Question 1
        var s=details.personDetail("Abhishek","tothenew")


                //Quetion 2
        println("Question 2")
        val obj=SubClass1()
        var obj1=SubClass2()
        var obj3=SubClass3()
        matchSeal(obj)              //Subclass 1
        matchSeal(obj1)             //Subclass 2
        matchSeal(obj3)             //Subclass 3

    println("Question 3 Output")
    println(output)     //Question 3
    }

        //Question1:WAP to create singleton class.
object SingletonClass{
    init {
        println("This is a singleton Class")
    }
    fun personDetail(name: String,organisation: String){
        println("I am $name")
        println("I am working in $organisation organisation")
    }
}
    /* Question2:
    WAP to create sealed Base class and 3 subclasses of Base class, write
    * a function which will have base class object as an
    * argument and it will return name of the subclass based argument type.
    */
    sealed class Base
    class SubClass1 : Base()
    class SubClass2 : Base()
    class SubClass3 : Base()

    fun matchSeal(base: Base){

       when(base) {
            is SubClass1 -> println("Subclass1")
            is SubClass2 -> println("Subclass2")
            is SubClass3 -> println("Subclass3")
        }
    }

    //Question3: WAP to create extension function.

    val a="Aashutosh, "
    val b="Naveen "
    val c="great"
    val output=c.con(a,b)

    fun String.con(str1:String,str2:String):String{
        val combine=str1+str2+this
        return combine.uppercase(Locale.getDefault())
    }