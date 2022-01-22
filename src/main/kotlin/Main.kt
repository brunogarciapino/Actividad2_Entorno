import java.lang.Exception

fun imprimirVelas(edad:Int ) {
    repeat(edad) {
        print(",")
    }
    println()
    repeat(edad) {
        print("|")
    }
}
    fun imprimirCapaSup(edad: Int) {
    repeat(edad){
        print("=")
    }
    }
    fun imprimirCapasInf(edad: Int,numcapas:Int) {
    repeat(numcapas){ repeat(edad){ print("@") }
        println()
    }
    }
fun imprimirMensaje(mensaje:String, edad:Int){
    val espacios = (edad - mensaje.length)/2
    var dibujo:String = ""
    while (dibujo.length < (mensaje.length + espacios*2)){ dibujo += ("\"-._.-\"") }
    println(dibujo)
    println(" ".repeat(espacios) + mensaje + " ".repeat(espacios))
    println(dibujo)

}

    fun main() {
        var edad:Int
        var mensaje: String
        var numcapas: Int
        println("Introduce tu edad")
         try {
             edad = readLine()?.toInt()!!
         } catch (_:Exception){
             println("Introduzca una edad");return
         }
        println("Introduce tu el mensaje que quieres que se imprima")
        try {
            mensaje = readLine()?.toString()!!
        } catch (_:Exception){
            println("Introduzca un mensaje");return
        }
        println("Introduce el numero de capas")
        try {
            numcapas = readLine()?.toInt()!!
        } catch (_:Exception){
            println("Introduzca un número");return
        }

        if (edad in 1..110) {
            println()
            imprimirMensaje(mensaje, edad)
            println()
            imprimirVelas(edad)
            println()
            imprimirCapaSup(edad)
            println()
            imprimirCapasInf(edad, numcapas)
            imprimirMensaje(mensaje, edad)

        }else {
            println("Debe de introducir su edad real");return
        }
    }

