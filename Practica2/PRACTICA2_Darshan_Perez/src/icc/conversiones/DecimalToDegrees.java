
package icc.conversiones;

public class DecimalToDegrees {

    private int degrees;
    private int minutes;
    private double seconds;

//Ingresa los grados en decimales
    public void convert(double decimalDegrees) {
        //De Decimal Grados a grados normalitos
        degrees = (int)decimalDegrees;
        //minutos = a solo el decimal de los grados multiplicado por 60 (minutos)
        minutes = (int)(60*((decimalDegrees - ((int)decimalDegrees))));
        //Para no hacer la asign. muy larga, se divide en dos, en la primero se calculan los minutos
        seconds = (60*((decimalDegrees - ((int)decimalDegrees))));
        //los minutos se vuelven segundos (60 segundos por minuto)
        seconds = 60*(seconds - (int)seconds);
        
    }


    public int degrees() {
        return degrees;
    }

    public int minutes() {
        return minutes;
    }

    public double seconds() {
        return seconds;
    }
}
