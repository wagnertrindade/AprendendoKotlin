package academy.learnprogramming.challenges

//exemplos de loop, if else e instruções associadas

fun main(args: Array<String>) {

    // 5, 10, 15, 20, 25... 5000
    for (i in 5..5000 step 5) {
        println(i)
    }

    // -500, -499, -498... 0
    for (i in -500..0) {
        println(i)
    }

    // 0, 1, 1, 2, 3, 5, 8...
    // imprime os 15 mprimeiros números da sequência fibonacci
    var total: Int
    var anterior = 0
    var ultimo = 1

    println(anterior)
    println(ultimo)
    for (i in 1..13) {
        total = anterior + ultimo
        println(total)
        anterior = ultimo
        ultimo = total
    }

    // break, continue e label
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }

    // criar uma variável chamada num (int) e colocar qualquer valor
    // criar uma variável chamada dnum (double) e colocar os seguintes valores:
    // if num > 100, dnum = -234.567
    // if num < 100, dnum = 4444.555
    // if num == 100, dnum = 0.0
    // fazer tudo acima em uma instrução
    val num = 101
    println(if (num < 100) {
        -234.567
    }
    else if (num > 100) {
        4444.555
    }
    else {
        0.0
    })

    // imprimir o valor de dnum
    val dnum = when {
        num < 100 -> -234.567
        num > 100 -> 4444.555
        else -> 0.0
    }
    println(dnum)

}