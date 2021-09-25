import java.time.LocalDate

class Impuesto(val persona: Persona, val fechaPago: LocalDate) {
    var descuento = 0.0
    private var mesPago = fechaPago.monthValue

    private var listaPredios = arrayListOf<Predio>()
    fun agregarPredios(predio: Predio) {
        listaPredios.add(predio)
    }

    fun calcularTotalSinDescuento(): Double {
        var sumaPredios = 0.0
        listaPredios.forEach { predio ->
            sumaPredios += predio.calcularCosto()
        }
        return sumaPredios
    }

    fun calcularImpuestoTotal(): Double {
        if (persona.calcularEdad() >= 70 && mesPago <= 2 || persona.mSoltera && mesPago <= 2) {

            descuento = ((calcularTotalSinDescuento() / 100) * 70)

        } else if (persona.calcularEdad() >= 70 && mesPago > 2 || persona.mSoltera && mesPago > 2) {

            descuento = ((calcularTotalSinDescuento() / 100) * 50)
        } else if (mesPago <= 2) {

            descuento = ((calcularTotalSinDescuento() / 100) * 40)

        } else {

            descuento = 0.0

        }
        return calcularTotalSinDescuento() - descuento
    }
}








/*fun calcImpuestoTotal(predio: Predio, zona: Zona): Double {
       impTotal = predio.calcularPago() - descuento

       return impTotal
   }*/

/* var zonas = arrayOf(
        Zona(clave = "MAR", zona = "Marginado", costo = 2.00),
        Zona(clave = "RUR", zona = "Rural", costo = 8.00),
        Zona(clave = "URB", zona = "Urbano", costo = 10.00),
        Zona(clave = "RES", zona = "Residencial", costo = 25.00)
    )

    fun calcularImpuesto(predio: Predio): Double {
        zonas.forEach { zona: Zona ->
            if (zona.clave == predio.zona) {
                impPre = zona.costo * predio.tamano
                return impPre
            }
        }
        return impPre
    }*/
