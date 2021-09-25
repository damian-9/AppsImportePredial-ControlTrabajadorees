import java.time.LocalDate

class Personal(
    val id_Personal: Int,
    val nombre: String,
    val gradoAcademico: GradoAcademico,
    val curp: String,
    val fecha_Ingreso: LocalDate,
    val genero: String,
    val clavePresupuestal: String
) {

    fun calcularAntigüedad() = LocalDate.now().year - fecha_Ingreso.year


}

