const val Respuestas_Afirmativas = "✅"
const val Respuestas_Negativas = "❌"
const val Respuestas_Dudosas = "?"


val Respuestas = mapOf(
    "si" to Respuestas_Afirmativas,
    "Es cierto" to Respuestas_Afirmativas,
    "Totalmente" to Respuestas_Afirmativas,
    "Sin duda" to Respuestas_Afirmativas,
    "Pregunta en otro momento" to Respuestas_Dudosas,
    "No puedo responderte en este momento" to Respuestas_Dudosas,
    "Quizas si, quizas no" to Respuestas_Dudosas,
    "No va a suceder" to Respuestas_Negativas,
    "No cuentes con eso" to Respuestas_Negativas,
    "Definitivamente no" to Respuestas_Negativas,
    "No puedo creerlo" to Respuestas_Negativas
)



fun preguntar ( ){
    println("Que pregunta desea realizar?")
    readlnOrNull()
    println ("Asi que esa era la pregunta ...... la respuesta es :")
    val respuestagenerada = Respuestas.keys.random()
    println(respuestagenerada)
}
fun Mostrarrespuestasportipo( tipoderespuesta: String = "Todos") {
    when (tipoderespuesta) {
        "Todos" -> Respuestas.keys.forEach { respuesta: String -> println(respuesta) }
        Respuestas_Afirmativas -> Respuestas.filterValues { values -> values == Respuestas_Afirmativas }
            .also { RespuestasPositivas -> println(RespuestasPositivas.keys) }

        Respuestas_Negativas -> Respuestas.filterValues { values -> values == Respuestas_Negativas }
            .also { Respuestasnegativas -> println(Respuestasnegativas.keys) }

        Respuestas_Dudosas -> Respuestas.filterValues { values -> values == Respuestas_Dudosas }
            .also { RespuestasDudosas -> println(RespuestasDudosas.keys) }
    }
}
fun exit() {
    println("Hasta luego")
}
    fun showError() {
        println("parece que haz elegido una opcion incorrecta..... prueba de nuevo")
    }

    fun VerRespuestas() {
        println(
            "seleccione una  opcion:\n" +
                    "1. Revisar todas las respuestas\n" +
                    "2. Revisar solo las respuestas afirmativas\n" +
                    "3. Revisar solo las respuestas negativas\n" +
                    "4. Revisar solo las respuestas dudosas\n"
        )
        val inputValue2 = readLine()


        when (inputValue2) {
            "1" -> Mostrarrespuestasportipo()
            "2" -> Mostrarrespuestasportipo(Respuestas_Afirmativas)
            "3" -> Mostrarrespuestasportipo(Respuestas_Negativas)
            "4" -> Mostrarrespuestasportipo(Respuestas_Dudosas)
            else -> println("Respuesta no valida...Adios")
        }
    }

    fun main() {

        println(
            "Hola, soy la bola 8 creada en Kotlin . que desea hacer?\n" +
                    "1. Realizar una pregunta\n" +
                    "2. Revisar todas las respuestas\n" +
                    "3. Salir"
        )

        val inputValue = readlnOrNull()


        when (inputValue) {
            "1" -> preguntar()
            "2" -> VerRespuestas()
            "3" -> exit()
            else -> showError()
        }
    }



