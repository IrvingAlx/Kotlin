class Auto (val marca:String, val modelo:String){
    var distancia:Int = 0
    fun avanzar(){
        distancia++
    }
    fun avanzar(x:Int){
        distancia+=x
    }
    override fun toString():String = "$marca $modelo Distancia=$distancia km"
}

fun main() {

    var miVocho:Auto = Auto("VM","sedan")
    var miFerrari = Auto("Ferrari","Clasico")
    miVocho.avanzar(100)
    miFerrari.avanzar(200)

    println(miVocho)
    println(miFerrari)

    var autos = listOf(miVocho,miFerrari)
    var masAutos = mutableListOf<Auto>()
    masAutos.add(miVocho)
    masAutos.add(miFerrari)
    masAutos.add(Auto("Nissan","Tsuru"))
    for (auto in masAutos){
        println(auto)
    }
    masAutos.removeAt(0)
}