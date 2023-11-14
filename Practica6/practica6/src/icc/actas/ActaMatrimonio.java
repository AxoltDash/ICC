package icc.actas;

import icc.colors.Colors;

public class ActaMatrimonio extends Acta {

    private String ciudad;
    private String conyuge;

    public ActaMatrimonio(String nombre, String fecha, String conyuge, String ciudad) {
        super(nombre, fecha);
        this.ciudad = ciudad;
        this.conyuge = conyuge;
    }

    public String getCiudad(){
        return ciudad;
    }

    public String getConyuge(){
        return conyuge;
    }
}