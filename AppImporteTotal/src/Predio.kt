class Predio(val IZona: IZona, val tamanio: Double) {

      fun calcularCosto()= tamanio * IZona.costo

}