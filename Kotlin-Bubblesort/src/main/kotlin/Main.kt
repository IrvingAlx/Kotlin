fun bubbleSort(numeros: IntArray, tam: Int) {
    for (i in 0 until tam - 1) {
        for (j in 0 until tam - i - 1) {
            if (numeros[j] > numeros[j + 1]) {
                val temp = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = temp
            }
        }
    }
}

fun imprimirDatos(numeros: IntArray, tam: Int) {
    for (i in 0 until tam) {
        println("${numeros[i]}")
    }
}

fun main(args: Array<String>) {
    var numeros = intArrayOf(9,6,7,2,5,3)
    var tam = numeros.size

    println("BubbleSort: \n");
    bubbleSort(numeros, tam);
    imprimirDatos(numeros,tam);

    return
}