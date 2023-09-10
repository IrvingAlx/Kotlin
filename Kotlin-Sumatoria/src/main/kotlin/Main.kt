fun sumatoria(x:Int){
    var sumatoria:Int = 0
    println("Sumatioria de k=1 hasta k=5, de k^2\n")
    for (j in 0..x){
        sumatoria += j*j
        println("${j} = ${sumatoria}")
    }
}

fun main(args: Array<String>) {
    println("Sumatoria  ${sumatoria(9)}")
}