class libros (var titulo: String, var autor: String, var paginas: Int, clasificacion:Int){
    var clasificacion = clasificacion
        set(valor){
            if (valor in 0..10)
                field=valor
        }

    init{
        require(clasificacion in 0..10){"Clasificación fuera de rango, por favor introduzca una " +
                "clasificación de máximo 10"}
    }

    override fun toString(): String {
        return "libros: titulo: '$titulo', autor: '$autor', paginas: $paginas, clasificacion: $clasificacion"
    }
}

