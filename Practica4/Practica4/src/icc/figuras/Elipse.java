package icc.figuras;
import java.text.DecimalFormat;
import icc.colors.Colors;

public class Elipse{
    //Se definen los ejes 
    private double ejeMayor, ejeMenor, diametro;

    // public Elipse(double ejeMayor, double ejeMenor) {
    //     this.ejeMayor = ejeMayor;
    //     this.ejeMenor = ejeMenor;
    // }
    public Elipse(double eje1, double eje2) {
        // Asegura que ejeMayor siempre sea el valor más grande
        if (eje1 > eje2) {
            this.ejeMayor = eje1;
            this.ejeMenor = eje2;
        } else {
            this.ejeMayor = eje2;
            this.ejeMenor = eje1;
        }
    }

    //Método de acceso a Perimetro Elipse
    public double perimetro() {
        return 2 * Math.PI * Math.sqrt(((ejeMayor/2) * (ejeMayor/2) + (ejeMenor/2) * (ejeMenor/2)) / 2);
    }

    //Método de acceso a Área Elipse
    public double area() {
        return (ejeMayor/2) * (ejeMenor/2) * Math.PI;
        
    }

    public double ejeMayor(){
        return ejeMayor;
    }
    public double ejeMenor(){
        return ejeMenor;
    }

    public boolean encaja(Circulo circulo) {
        // Calcula el radio de la circunferencia que encajaría en la elipse
        double radioCirculoMin = Math.min(ejeMayor, ejeMenor) / 2.0;
        // double radioCirculoMax = Math.max(ejeMayor, ejeMenor) / 2.0;
        // if (radioCirculoMax == radioCirculoMin) {
        //     println
        // }
        // Comprueba si el radio del círculo es menor o igual al radio de la circunferencia que encaja en la elipse
        return circulo.radio() <= radioCirculoMin;
    }
}