// Ejercicio 1
fun ejercicio1() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    println(greenNumbers.count() + redNumbers.count())
}

// Ejercicio 2
fun ejercicio2() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"

    val isSupported = requested.uppercase() in SUPPORTED

    println("Support for $requested: $isSupported")
}

// Ejercicio 3
fun ejercicio3() {
    val number2word = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    val n = 2

    println("$n is spelled as '${number2word[n]}'")
}

// Ejecutar los ejercicios
fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
}
