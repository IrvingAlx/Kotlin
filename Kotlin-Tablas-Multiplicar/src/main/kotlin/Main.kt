fun main(args: Array<String>) {
    var result:Int
    for (i in 1..10){
        for (j in 1..10){
            result = i*j
            println("${i}*${j} = ${result}")
        }
    }
}