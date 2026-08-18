// Ejercicio 1
data class Employee(val name: String, var salary: Int)

fun ejercicio1() {
    val emp = Employee("Mary", 20)

    println(emp)

    emp.salary += 10

    println(emp)
}


// Ejercicio 2
data class Person(
    val name: Name,
    val address: Address,
    val ownsAPet: Boolean = true
)

data class Name(
    val first: String,
    val last: String
)

data class Address(
    val street: String,
    val city: City
)

data class City(
    val name: String,
    val countryCode: String
)

fun ejercicio2() {
    val person = Person(
        Name("John", "Smith"),
        Address(
            "123 Fake Street",
            City("Springfield", "US")
        ),
        ownsAPet = false
    )

    println(person)
}


fun main() {
    ejercicio1()
    ejercicio2()
}
