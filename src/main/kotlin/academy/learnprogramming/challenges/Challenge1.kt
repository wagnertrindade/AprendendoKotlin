package academy.learnprogramming.challenges

fun main(args: Array<String>) {

    //exemplos de type inference
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 e hello2 são referencialmente iguais? ${hello1 === hello2}")

    println("hello1 e hello2 são estruturalmente iguais? ${hello1 == hello2}")

    var numero = 2988

    //exemplo do tipo Any e smart cast
    val qualquerValor: Any = "The Any type is the root of the Kotlin class hierarchy"

    if (qualquerValor is String)
        println(qualquerValor.toUpperCase())

    //exemplo de tripple quotted string
    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())

    println("""1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}