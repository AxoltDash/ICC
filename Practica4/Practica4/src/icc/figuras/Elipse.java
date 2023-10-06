package icc.figuras;
import java.text.DecimalFormat;
import icc.colors.Colors;

public class Elipse{
    //Se definen los ejes 
    private double ejeMayor, ejeMenor;

    // public Elipse(double ejeMayor, double ejeMenor) {
    //     this.ejeMayor = ejeMayor;
    //     this.ejeMenor = ejeMenor;
    // }
    public Elipse(double ejeA, double ejeB) {
        // Asegura que ejeMayor siempre sea el valor más grande
        if (ejeA >= ejeB) {
            this.ejeMayor = ejeA;
            this.ejeMenor = ejeB;
        } else {
            this.ejeMayor = ejeB;
            this.ejeMenor = ejeA;
        }
    }

    // metodo para acceder al radio mayor
    public double majorRadio() {
        return ejeMayor / 2;
    }

    // medtodo para acceder al radio menor 
    public double minorRadio() {
        return ejeMenor / 2;
    }
    
    //Método de acceso a Perimetro Elipse
    public double perimetro() {
        return Math.PI * 3 * (majorRadio() + minorRadio()) - Math.PI * Math.sqrt((3 *majorRadio() + minorRadio()) * (majorRadio() + 3 * minorRadio()));
    }

    //Método de acceso a Área Elipse
    public double area() {
        return (majorRadio()) * (minorRadio()) * Math.PI;
        
    }

    public double ejeMayor(){
        return ejeMayor;
    }
    public double ejeMenor(){
        return ejeMenor;
    }

    public boolean encaja(Circulo circulo) {
        /* Comprueba si el radio del círculo es menor o igual
        al radio de la circunferencia que encaja en la elipse*/
        return Math.abs(circulo.radio() - minorRadio()) <= (0.01 / 3.0);
    }
}