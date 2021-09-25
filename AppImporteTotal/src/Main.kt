import org.junit.Test
import java.time.LocalDate

class Main {
    @Test
    fun main() {
        val persona =
            Persona(
                nombre = "Damian",
                apellido = "Martinez Jimenez",
                fNacimiento = LocalDate.of(1998, 9, 10),
                mSoltera=false
            )

        val impuesto = Impuesto (persona = persona, fechaPago = LocalDate.of(2021, 2, 21))
        impuesto.agregarPredios(Predio(ZonaMarginado(),700.0))
        impuesto.agregarPredios(Predio(ZonaRural(),250.0))
        impuesto.agregarPredios(Predio(ZonaUrbana(),500.0))
        impuesto.agregarPredios(Predio(ZonaResidencial(),300.0))

        println("Nombre: " + (persona.nombre + " ") + (persona.apellido))
        println("Edad: " + persona.calcularEdad())
        println("Fecha de pago: " + impuesto.fechaPago)
        println("El impuesto predial antes de descuento es: $" + impuesto.calcularTotalSinDescuento())
        println("El impuesto total a pagar es: $" + impuesto.calcularImpuestoTotal())

    }
}

