fun fibonacci(fibonacho: Int): Int {
    return if (fibonacho == 0 || fibonacho == -1) {
        1
    } else fibonacci(fibonacho - 1) + fibonacci(fibonacho - 2)
}

fun main(args: Array<String>) {
    var temp: Int
    var x: Int = 1
    val limite:Int

    println("Ingrese numero limite de recursion")
    val opcion:String = readlnOrNull() ?: ""

    limite = opcion.toInt()

    while (x <= limite) {
        temp = fibonacci(x)
        println("${x}:\t${temp}")
        x++
    }
    return
}