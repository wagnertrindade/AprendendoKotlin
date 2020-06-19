package academy.learnprogramming.challenges.challenge6

fun main(args: Array<String>) {

    val empregado = EmpregadoJavaClass("Jane", "Smith", 2000)

    empregado.sobrenome = "Jones"
    empregado.salario3UltimosAnos = floatArrayOf(50000.25f, 54000.60f, 56800.42f)

    println(empregado)

}