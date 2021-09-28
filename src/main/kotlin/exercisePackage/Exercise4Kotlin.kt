package exercisePackage


fun main(){
    println(simpleInterest)

    val result = employeeList.filter(agePredicate)
//  println(result)
    result.forEach {
        println("Name: ${it.name}, Age: ${it.age}")
    }
}

    var SI:(Int,Int,Int) -> Double = {
        p,r,t -> ((p*r*t)/100).toDouble()
    }

    var simpleInterest=SI(50000,9,13)

data class Employee(val name: String, val age: Int)
val employeeList = listOf(
    Employee("Captain ",105),
    Employee("Ant Man", 35),
    Employee("Peter Parker", 24),
    Employee("Black widow", 23),
    Employee("Krish", 30),
    Employee("Krishna", 31)
)
val agePredicate: (Employee) -> Boolean = { person: Employee -> person.age >30 }

