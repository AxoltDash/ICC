
package icc.conversiones;

public class DegreesToDecimal {

    private double decimal;

    public void convert(int degrees, int minutes, double seconds) {
        //Primero convierte los grados enteros a double para convertirlos a grados decimales
        //Convierte los minutos a double y lo divide entre 60
        //Convierte los segundos a grados decimales al dividirlo por /3600
        decimal = ((double)degrees)+(((double)minutes)/60)+(seconds/3600);
        //se suma todo para convertir todo en grados decimales
    }

    public double decimal() {
        return decimal;
    }
}

