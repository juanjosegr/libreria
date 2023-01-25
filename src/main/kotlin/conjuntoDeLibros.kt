class conjuntoDeLibros(){
    val conjuntoDeLibros = mutableListOf<libros>()

    fun añadir(libros: libros){
        if (conjuntoDeLibros.size < 5){
            conjuntoDeLibros.add(libros)
        }else{
            println("El máximo de libros es 5.")
        }
    }

    fun imprimir(){
        for (libro in conjuntoDeLibros){
            println(libro)
        }
    }

    fun eliminarLibro(){
        println("Introduzca el nombre del libro a borrar ")
        val borrar = readln()
        for (a in conjuntoDeLibros){
            if (a.titulo.equals(borrar)){
                conjuntoDeLibros.remove(a)
                break
            }
        }
    }
    fun eliminarAutor(){
        println("Introduzca el nombre del libro a borrar ")
        val borrar = readln()
        for (a in conjuntoDeLibros){
            if (a.autor.equals(borrar)){
                conjuntoDeLibros.remove(a)
                break
            }
        }
    }
}