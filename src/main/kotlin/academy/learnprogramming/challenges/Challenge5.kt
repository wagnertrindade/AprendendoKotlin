package academy.learnprogramming.challenges

// Lambdas e coleções
//faltou realizar e adicionar aqui os exercícios de generics

class Pessoa(val nome: String, val sobrenome: String, val idade: Int) {

    //para ser usado abaixo, possibilitando destructuring declarations
    operator fun component1() = nome
    operator fun component2() = sobrenome
    operator fun component3() = idade

}

fun main(args: Array<String>) {

    val joe = Pessoa("Joe", "Jones", 45)
    val jane = Pessoa("Jane", "Smith", 12)
    val mary = Pessoa("Mary", "Wilson", 70)
    val john = Pessoa("John", "Adams", 32)
    val jean = Pessoa("Jean", "Smithson", 66)

    val pessoas = mapOf("Jones" to joe,
            "Smith" to jane,
            "Wilson" to mary,
            "Adams" to john,
            "Smithson" to jean)

    //count - quantidade de itens filtrados
    println(pessoas.filter { it.value.sobrenome.startsWith('S') }.count())
    println()

    //map - criar uma coleção a partir de outra coleção
    val paresDeNomes = pessoas.map { Pair(it.value.nome, it.value.sobrenome) }
    println(paresDeNomes)
    println()

    val nomes = pessoas.map { it.value.nome }
    val sobrenomes = pessoas.map { it.value.sobrenome }
    val paresDeNomes2 = nomes.zip(sobrenomes)
    println(paresDeNomes2)
    println()

    // also()
    pessoas.also {
        it.map { println("${it.value.nome} tem ${it.value.idade} anos de idade")}
    }

    //exemplo de destructuring declaration
    //decomposição de objeto em variáveis distintas
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")
    println()

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.filter { list2.contains(it) }
    println("list3 = $list3")
    println()

}
