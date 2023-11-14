package icc.actas;

import icc.colors.Colors;

public class ActaVacunacion extends Acta {

    private String[] vacunas;
    
    public ActaVacunacion(String nombre, String fecha, String[] vacunas) {
        super(nombre, fecha);
        this.vacunas = vacunas;
    }

    public String[] getVacunas(){
        return vacunas;
    }
}