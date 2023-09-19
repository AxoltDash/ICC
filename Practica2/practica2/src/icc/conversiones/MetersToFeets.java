//package, osea en que carpetas estan
package icc.conversiones;
//Se refleja 
public class MetersToFeets {
//STATIC, nromalmente solo MAIN es static.
    private int feets;
    private double inches;
//private siempre(excepto si se necesita que sea publica)

////Ingresasmetro.cms

    public void convert(int meters, double centimeters) {
        inches = (centimeters + (100 * meters)) / 2.54;
        feets = (int)(inches / 12);
        inches = inches % 12;
    }

    public int feets() {
        return feets;
    }

    public double inches() {
        return inches;
    }
}
