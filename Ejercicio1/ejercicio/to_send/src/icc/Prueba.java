
package icc;

import java.util.Scanner;

import icc.colors.Colors;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        int val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println(mensaje);
            if (scn.hasNextInt()) {
                val = scn.nextInt();
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    System.out.println(error);
                } else {
                    return val;
                }
            } else {
                scn.next();
                System.out.println(error);
            }
        }
    }

    public static void cancion(int max) {
        for (int i = max; i >= 1; i--) {
            System.out.print(i);
            System.out.println(" bottles of beer on the wall");
            System.out.print(i);
            System.out.println(" bottles of beer");
            System.out.println("If one of those bottles should happen to fall");
            System.out.print(i - 1);
            System.out.println(" bottles of beer on the wall");
            System.out.println();
        }
    }
//====================================
//Triangulo I
    public static void trianguloI(int max) {
        for (int iT1 = 1; iT1 <= max; iT1++) {
            for (int jT1 = 1; jT1 <= iT1; jT1++) {
                Colors.print("*", Colors.CYAN);
            }
            System.out.println();
        }
    }
//====================================
//Triangulo II
    public static void trianguloII(int max) {
        for (int iT2 = 1; iT2 <= max; iT2++) {
            // Imprime espacios en blanco antes de los asteriscos
            for (int jT2 = 1; jT2 < iT2; jT2++) {
                Colors.print(" ", Colors.CYAN);
            }
            
            // Imprime asteriscos
            for (int kT2 = iT2; kT2 <= max; kT2++) {
                Colors.print("*", Colors.CYAN);
            }
            
            System.out.println();
        }
    }
//====================================
//Triangulo III
    public static void trianguloIII(int max) {
        for (int iT3 = max; iT3 >= 1; iT3--) {
            // Imprime asteriscos
            for (int jT3 = 1; jT3 <= iT3; jT3++) {
                Colors.print("*", Colors.CYAN);
            }
            System.out.println();
        }
    }
//====================================
//Triangulo IV
    public static void trianguloIV(int max) {
        for (int iT4 = 1; iT4 <= max; iT4++) {
            // Imprime espacios en blanco a la izquierda
            for (int jT4 = 1; jT4 <= max - iT4; jT4++) {
                Colors.print(" ", Colors.CYAN);
            }
            
            // Imprime asteriscos
            for (int kT4 = 1; kT4 <= iT4; kT4++) {
                Colors.print("*", Colors.CYAN);
            }
            
            System.out.println(); 
        }
    }

    public static void main(String args[]) {
        int opcion, aux;
        String mensaje, error;
        StringBuilder sb;
    //Introducción inicial al programa
        Colors.println("\t//////////////////////////////////////////////////////", Colors.GREEN);
        Colors.println("\t//¡BIENVENIDO AL PROGRAMA CREA TRIÁNGULOS CON \"FOR\"!//", Colors.GREEN + Colors.HIGH_INTENSITY);
        Colors.println("\t//////////////////////////////////////////////////////", Colors.GREEN);
    
        sb = new StringBuilder();
        sb.append("\nEste programa realiza la impresion de algunos ejercicios con for.\n");
        sb.append("1. Cancion.\n");
        sb.append("2. Triangulo I.\n");
        sb.append("3. Triangulo II.\n");
        sb.append("4. Triangulo III.\n");
        sb.append("5. Triangulo IV.\n");
        sb.append("0. Salir.\n");
        sb.append("Escoje una opcion.\n");

        aux = -1;
        do {
            opcion = getInt(sb.toString(), "Por favor ingresa una opcion valida.", 0, 5);

            if (opcion != 0) {
                aux = getInt("Por favor ingresa un nuero entre 1 y 100", "Por favor ingresa una opcion valida.", 1, 100);
            }

            switch (opcion) {
                case 1:
                    cancion(aux);
                    break;
                case 2:
                    trianguloI(aux);
                    break;
                case 3:
                    trianguloII(aux);
                    break;
                case 4:
                    trianguloIII(aux);
                    break;
                case 5:
                    trianguloIV(aux);
                    break;
                case 0:
                    Colors.println("Vuelve pronto.", Colors.BLUE + Colors.HIGH_INTENSITY);
                    break;
            }
        } while (opcion != 0);
    }

}
