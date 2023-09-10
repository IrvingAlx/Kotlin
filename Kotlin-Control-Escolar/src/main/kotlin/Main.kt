class Alumno (val nombre:String, val apellidoP:String, val apellidoM:String,val id: Int){
    var materiaId:Int = 0
    var calificacion:Int = 0
    fun setGroup(grupo:Int){
        materiaId = grupo
    }
    fun getMateria():Int{
        return materiaId
    }
    fun setCalif(calif:Int){
        calificacion = calif
    }
    override fun toString():String = "Nombre: \n $nombre $apellidoP $apellidoM \n Materia: 
                                        $materiaId \n Calificacion: $calificacion"
}

class Materia (val nombre:String, val id:Int){
    override fun toString():String = "\n $nombre $id"
}

class Calificacion (val calif:String){
    fun imprimr(materias:MutableList<Materia>, alumnos:MutableList<Alumno>){
        var cont:Int = 1
        var cont2:Int = 0

        for (materia in materias){
            cont2 = 0
            println(materia)
            for (alumno in alumnos){
                if (cont == alumnos[cont2].getMateria()){
                    println(alumno)
                }
                cont2++
            }
            cont++
        }
    }
    override fun toString():String = "$calif"
}

fun main(args: Array<String>) {

    var alumnos = mutableListOf<Alumno>()
    var materias = mutableListOf<Materia>()
    var calificacion = Calificacion("1")

    alumnos.add(Alumno("Irving","Vega","Lagunas",0))
    alumnos.add(Alumno("Ana Karen","Cabrera","Perez",1))
    alumnos.add(Alumno("Diego","Leonardo","Zamora",2))
    alumnos.add(Alumno("Fernando","Yedra","Dominguez",3))

    materias.add(Materia("Calculo",1))
    materias.add(Materia("Fisica",2))

    alumnos[0].setGroup(1)
    alumnos[1].setGroup(2)
    alumnos[2].setGroup(1)
    alumnos[3].setGroup(2)

    calificacion.imprimr(materias,alumnos)

    alumnos[0].setCalif(10)
    alumnos[1].setCalif(10)
    alumnos[2].setCalif(5)
    alumnos[3].setCalif(5)

    calificacion.imprimr(materias,alumnos)

}