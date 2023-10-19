
package icc;
import java.util.Scanner;
import icc.colors.Colors;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        int val;
        Scanner scn = new Scanner(System.in);
        while (true) {
            Colors.println(mensaje, Colors.HIGH_INTENSITY);
            if (scn.hasNextInt()) {
                val = scn.nextInt();
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
                } else {
                    return val;
                }
            } else {
                scn.next();
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);;
            }
        }
    }

    //Método que regresa un String del verso segun su numero
    public static String songVerse(int verse) {
        switch(verse){
            case 1:
                return "A partridge in a pear tree";
            case 2:
                return "Two turtle doves, and";
            case 3:
                return "Three french hens";
            case 4:
                return "Four calling birds";
            case 5:
                return "Five golden rings";
            case 6:
                return "Six geese a-laying";
            case 7:
                return "Seven swans a-swimming";
            case 8:
                return "Eight maids a-milking";
            case 9:
                return "Nine ladies dancing";
            case 10:
                return "Ten lords a-leaping";
            case 11:
                return "Eleven pipers piping";
            case 12:
                return "Twelve drummers drumming";
            default:
                return "Valor inválido";
        }
    }

    //Método que regresa en ordinales
    public static String numOrdinal(int ordinal) {
        switch(ordinal){
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
            default:
                return "Valor inválido";
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        //Introducción al programa
        Colors.println("\t////////////////////////////////////////////////", Colors.RED + Colors.HIGH_INTENSITY);
        Colors.println("\t//¡BIENVENID@ A LA PRACTICA 05! CHRISTMAS SONG//", Colors.HIGH_INTENSITY);
        Colors.println("\t////////////////////////////////////////////////", Colors.RED + Colors.HIGH_INTENSITY);
        System.out.println();
        int opcionUsr = getInt("Por favor, ingrese un num. entre el 1 y el 12","error",1,12);        

        for (int i = 1; i <= opcionUsr; i++){

            System.out.println();
            Colors.println("-=-=-=-=-=-=-=-=-=-", Colors.GREEN); //Imprime un espacio entre cada ciclo
            System.out.println();

            String ordinalFor = numOrdinal(i);
            Colors.println("On the "+ ordinalFor +"day of Christmas, my true love sent to me", Colors.RED + Colors.HIGH_INTENSITY);
        
            //CIclo que imprime los versos segun el n
            for (int j = 1; j <= i; j++) {
                String verseFor = songVerse(j);
                if (j % 2 == 0) {
                    //PAR (Rojo)
                    Colors.println(verseFor, Colors.RED + Colors.HIGH_INTENSITY);
                } else {
                    //IMPAR (Blanco)
                    Colors.println(verseFor, Colors.HIGH_INTENSITY);
                }
            }
            

        }

    }
}
