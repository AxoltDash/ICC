package icc.actas;

import icc.colors.Colors;

public abstract class Acta {
    protected String nombre;
    protected String fecha;

    public Acta (String nombre, String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre(){
        return nombre;
    }

    public String getFecha(){
        return fecha;
    }
}