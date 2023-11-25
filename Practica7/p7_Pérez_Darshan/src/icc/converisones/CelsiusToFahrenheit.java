package icc.conversiones;

public class CelsiusToFahrenheit{
    
    /**
     * Metodo que convierte celsius a fahrenheit
     * 
     * @param celsius Los grados que deseas convertir
     * @return grados ya convertidos a Fahrenheit
     */
    public double convert(double celsius) {
        return (celsius * (9.0/5.0) + 32);
    }
}