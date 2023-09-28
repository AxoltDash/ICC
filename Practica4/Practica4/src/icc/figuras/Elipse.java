package icc.figuras;
import java.text.DecimalFormat;
import icc.colors.Colors;

public class Elipse{
    //Se definen los ejes 
    private double ejeMayor, ejeMenor;
    
    //Regresa el método 
    public double perimElpise () {
        return Math.PI * (ejeMayor + ejeMenor);
    }

    public double areaElpise () {
        return ejeMayor * ejeMenor * Math.PI;
        
    }

}