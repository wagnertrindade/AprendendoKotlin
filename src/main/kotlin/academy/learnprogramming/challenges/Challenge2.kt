package academy.learnprogramming.challenges

import java.util.*

fun main(args: Array<String>) {

    //variaveis que não podem receber nulos e variáveis que podem
    val floatNumber1 = -3847.384f
    val floatNumber2 = -3847.384.toFloat()

    val floatNumber3: Float? = -3847.384f
    val floatNumber4: Float? = -3847.384f.toFloat()

    println(floatNumber1)
    println(floatNumber2)
    println(floatNumber3)
    println(floatNumber4)

    //arrays não nulos
    val array1 = shortArrayOf(1, 2, 3, 4, 5)
    val array2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    //criação de array contendo os valores 5, 10, 15 ... 200
    //exemplo de uso de lambdas
    var array3 = Array<Int?>(40) {i -> (i + 1) * 5}

    //exemplo de array de tipo primitivo
    var array4 = charArrayOf('a', 'b', 'c')

    println(Arrays.toString(array1))
    println(Arrays.toString(array2))
    println(Arrays.toString(array3))
    println(Arrays.toString(array4))

    //operador elvis
    //se não for nulo, torna maiúscula, caso contrário, atribui outra string
    val x1: String? = "I AM IN UPPERCASE"
    val x2 = x1?.toUpperCase() ?: "I give up!"

    val x3: String? = null
    val x4 = x3?.toUpperCase() ?: "I give up!"

    println(x2)
    println(x4)

    //exemplo de uso do let, para tornar a string minúscula, e realizar substituições
    x1?.let { println(it.toLowerCase().replace("am", "am not")) }

    //exemplo de uso do operador "!!"
    val variavelNula: Int? = null
    println(variavelNula?.toDouble())
    println(variavelNula!!.toDouble())
}