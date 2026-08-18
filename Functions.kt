import kotlin.math.PI

// Ejercicio 1 
fun ejercicio1() {
    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }
    println(circleArea(2))
}

// Ejercicio 2 
fun ejercicio2() {
    fun intervalInSeconds(
        hours: Int = 0,
        minutes: Int = 0,
        seconds: Int = 0
    ) = ((hours * 60) + minutes) * 60 + seconds

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}

// Lambda expressions - Ejercicio 1
fun ejercicio3() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5

    val urls = actions.map { action -> "$prefix/$id/$action" }

    println(urls)
}

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
}
