package icc.conversiones;

public class FahrenheitToCelsius{
    /**
     * Metodo que convierte fahrenheit a celsius
     * 
     * @param fahrenheit Los grados que deseas convertir
     * @return grados ya convertidos a celcius
     */
    public double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}