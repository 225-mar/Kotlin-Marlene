// Ejercicio 1
fun ejercicio1() {
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        pizzaSlices++
        if (pizzaSlices < 8) {
            println("There's only $pizzaSlices slice/s of pizza :(")
        }
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

// Ejercicio 2
fun ejercicio2() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}

fun main() {
    ejercicio1()
    println()

    ejercicio2()
}
