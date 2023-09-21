
package icc;
import java.util.Scanner;
import java.util.Random;

public class Prueba {
        public enum pcMano {
            PIEDRA, PAPEL, TIJERA
        }

        public static pcMano pcManoJugada() {
        Random random = new Random();
        return pcMano.values()[random.nextInt(3)];

        }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("///////////////////////////////////////////");
        System.out.println("///¡Bienvenido a PIEDRA, PAPEL o TIJERA!///");
        System.out.println("///////////////////////////////////////////\n");

        System.out.println("Para jugar, competirás contra la computadora usando una de las sig. opciones:");
        System.out.println("\t- PIEDRA\n\t- PAPEL\n\t- TIJERA");
        System.out.println("Por favor escriba la mano que quieras jugar y presiona enter:");

        String usrMano = scan.nextLine();
        //Quitamos espacio usrMano
        usrMano = usrMano.trim();
        //Ponemos en mayusuculas
        usrMano = usrMano.toUpperCase();
        System.out.println("===========================================\n");
        //Comprueba que este bien escrita la jugada y empieza el reto
        if (usrMano.equals("TIJERA") || usrMano.equals("PIEDRA") || usrMano.equals("PAPEL") ){
            System.out.println("EMPIEZA EL JUEGO:");
            System.out.println("Tu jugada es: "+ usrMano);

            //Aqui obtenemos la jugada del metodo
            pcMano UltimatumJugadaPc = pcManoJugada();
            //Aqui lo convertimos a string bajo el nombre de otra variable
            String StringUltimatumPc = UltimatumJugadaPc.toString();

            System.out.println("La jugada de la máquina es: "+StringUltimatumPc);
            System.out.println("-------------------------------------------");

            //Código que dice quien es el ganador:
            //Evalua si es empate
            if (usrMano.equals(StringUltimatumPc)) {
                System.out.println("\n¡Salió un empate!");
            //Elejimos si gana en los 3 casos posibles:
            } else if ((usrMano.equals("PIEDRA")) && (StringUltimatumPc.equals("TIJERA"))) {
                System.out.println("\n¡Ganaste! "+usrMano+" vence a "+StringUltimatumPc);

            } else if ((usrMano.equals("TIJERA")) && (StringUltimatumPc.equals("PAPEL"))) {
                System.out.println("\n¡Ganaste! "+usrMano+" vence a "+StringUltimatumPc);    

            } else if ((usrMano.equals("PAPEL")) && (StringUltimatumPc.equals("PIEDRA"))) {
                System.out.println("\n¡Ganaste! "+usrMano+" vence a "+StringUltimatumPc);

            //Si no gana bajo ningun concepto, pierde e imprime los valores
            } else {
                System.out.println("\n¡Perdiste! "+usrMano+" pierde ante a "+StringUltimatumPc);
            }
        //Si escribirste mal el nombre de tu jugada:
        } else {
            System.out.println("Escribiste mal la jugada, no se pudo ejecutar el juego");
        }
    }
}
