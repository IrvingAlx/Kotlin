fun main() {

    var contador: Int = 0
    val pi = 3.141592653

    contador = 5
    println("Hola mundo Kotlin!!! ${contador}")
    println("El valor de pi es ${pi}")

    var x = 3
    var y:Int = 4
    val z:Int= 6

    var a = arrayOf(3,6,7,8,9,2)

    println("El valor de x es $x")
    println("El valor de y es ${y}")

    println("Los elementos del arreglo son:")
    for (p in a){
        println(p)
    }
    println("Un ciclo for para un rango:")
    for (i in 0..5){
        println(i)
    }
    println("Un ciclo for para un rango inverso:")
    for (i in (0..5).reversed()){
        println(i)
    }

    var opcion:String
    var edad:Int

    println("Dime tu edad")
    opcion = readLine() ?: ""

    edad = opcion.toInt()

    if (edad >= 18){
        println("Eres grande")
    }else{
        println("Eres joven")
    }

}