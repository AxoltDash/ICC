package icc.actas;

import icc.colors.Colors;

public class ActaNacimiento extends Acta {
    
    private String ciudad;

    public ActaNacimiento(String nombre, String fecha, String ciudad) {
        super(nombre, fecha);
        this.ciudad = ciudad;
    }

    public String getCiudad(){
        return ciudad;
    }
}