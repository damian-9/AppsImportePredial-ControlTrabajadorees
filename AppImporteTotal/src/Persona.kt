import java.time.LocalDate

data class Persona(
    val nombre: String, val apellido: String, val fNacimiento: LocalDate, val mSoltera: Boolean =false
) {

    fun calcularEdad() = LocalDate.now().year - fNacimiento.year

}

