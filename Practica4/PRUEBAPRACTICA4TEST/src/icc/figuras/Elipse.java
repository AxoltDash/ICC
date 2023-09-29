package icc.figuras;
import java.text.DecimalFormat;
import icc.colors.Colors;

public class Elipse{
    //Se definen los ejes 
    private double ejeMayor, ejeMenor;

    public Elipse(double ejeMayor, double ejeMenor) {
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }
    //Método de acceso a Perimetro Elipse
    public double perimElpise () {
        return 2 * Math.PI * Math.sqrt(((ejeMayor/2) * (ejeMayor/2) + (ejeMenor/2) * (ejeMenor/2)) / 2);
    }

    //Método de acceso a Área Elipse
    public double areaElpise () {
        return (ejeMayor/2) * (ejeMenor/2) * Math.PI;
        
    }

}