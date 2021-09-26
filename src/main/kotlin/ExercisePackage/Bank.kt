                    //Exercise- Day 2 kotlin

package ExercisePackage

/* Question 3: Create 3 sub class of bank SBI,BOI,ICICI all 4 should
 * have method called getDetails which provide there specific details like
 * rateofinterest etc,print details of every bank.

 */

fun main(args: Array<String>) {
    println(Sbi().getDetails(50000.5,9))
    println(Icici().getDetails(500000.5,6))
    println(Boi().getDetails(10000.5,3))
}
open class Bank {
open fun getDetails(Amt:Double,year:Int){

    println(Amt)
    println(year)
}
}
class Sbi: Bank(){
    override fun getDetails(Amt: Double, roi: Int) {
        super.getDetails(50000.0,5)
        println("This is SBI")
    }
}
class Boi: Bank(){
    override fun getDetails(Amt: Double, roi: Int) {
        super.getDetails(100000.0,4)
        println(roi)
        println("This is Boi")
    }
}
class Icici: Bank(){
    override fun getDetails(Amt: Double, roi: Int) {
        super.getDetails(500000.0,8)

        println("This is ICICI")
    }
}