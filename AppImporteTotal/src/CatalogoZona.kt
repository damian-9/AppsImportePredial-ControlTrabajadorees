class ZonaMarginado : IZona {
    override val clave = "MAR"
    override val zona = "Marginada"
    override val costo = 2.0
}

class ZonaRural : IZona {
    override val clave = "RUR"
    override val zona = "Rural"
    override val costo = 8.0
}

class ZonaUrbana : IZona {
    override val clave = "URB"
    override val zona = "Urbana"
    override val costo = 10.0
}

class ZonaResidencial : IZona {
    override val clave = "RES"
    override val zona = "Residencial"
    override val costo = 25.0
}

