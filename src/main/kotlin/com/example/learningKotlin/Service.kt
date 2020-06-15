package com.example.learningKotlin

import org.springframework.stereotype.Service
import java.util.*

@Service
class Service {

    fun gerarModel(entrada: String): String {

        val partes = Stack<String>()

        partes.addAll(
                entrada.split(" ").asReversed()
        )

//        if (partes.empty())
//            throw Exception("Entrada vazia")

        var model = "class ${partes.pop()}"

        if (!partes.empty())
            model += " ("

        while (!partes.empty()) {
            model += "val ${partes.pop()}"

            if (!partes.empty())
                model += ", "
        }

        model += ")"

        return model
    }

    fun gerenciarRotas(rotas: Rotas): Boolean {

        val partesUrlOriginal = rotas.urlOriginal.split("/")

        for (rota in rotas.list) {

            val partesRota = rota.split("/")

            if (partesRota.size != partesUrlOriginal.size)
                continue

            val itUrl = partesUrlOriginal.iterator()
            val itRota = partesRota.iterator()

            while (itUrl.hasNext()) {

                val strUrl = itUrl.next()
                val strRota = itRota.next()

                if (strUrl != strRota && !strRota.matches(Regex("""\{.+\}""")))
                    continue
            }

            return true
        }

        return false
    }

}