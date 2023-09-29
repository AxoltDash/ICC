
package icc;

import java.util.Scanner;

import icc.colors.Colors;
import icc.figuras.Circulo;
import icc.figuras.Elipse;

public class Prueba {


// public int min = 0;
// public int max = 4;
// public String mensaje = "Bienvenido al programa que\n";

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

    public static double getDouble(String mensaje, String error, double min, double max) {
        double val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println(mensaje);
            if (scn.hasNextDouble()) {
                val = scn.nextDouble();
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
    
    //Creamos un método para obtener double sin necesidad de valor máx y mín
    public static double getDoubleSimple(String mensaje, String error) {
        double val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            Colors.println(mensaje, Colors.HIGH_INTENSITY);
            if (scn.hasNextDouble()) {
                val = scn.nextDouble();
                return val;
            } else {
                scn.next();
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        }
    }


    public static void main(String args[]) {
        int opcion;
        String mensaje, error;
        StringBuilder sb;
        //Valor para repetir el while
        boolean i = true;

        Scanner scn = new Scanner(System.in);

        //Introducción al programa
        Colors.println("////////////////////////////////////////", Colors.CYAN);
        Colors.println("¡BIENVENIDO AL PROGRAMA CALULCA-ELIPSES!", Colors.CYAN + Colors.HIGH_INTENSITY);
        Colors.println("////////////////////////////////////////\n", Colors.CYAN);
        
        //Ciclo que ejecuta infinitamente hasta que i = false
        do{
            //Presentación de opciones:
            Colors.println("Las opciónes son:",  Colors.HIGH_INTENSITY);
            Colors.println("\t1. Obtener el perímetro de una elpise.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t2. Obtener el área de una elipse.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t3. Revisar si un circulo se encuentra en el borde de una elipse.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t0. Finalizar el programa.", Colors.MAGENTA + Colors.HIGH_INTENSITY);

            //Se declara error ya que se usa varias veces
            error = "Por favor, ingrese un número válido.";
            
            //Obtenemos la opción del jugador y ejecutamos el caso debido
            int opcionUsr = getInt("\nPor favor, ingrese el núm. de la opción deseada:", error, 0, 3);
            switch (opcionUsr){

            //SI queremos calcular perímetro:
            case 1:
                System.out.println("Usted eligió: " + opcionUsr);
                double ejeMayorC1 = getDoubleSimple("Ingrese el valor del eje mayor:", error);
                double ejeMenorC1 = getDoubleSimple("Ingrese el valor del eje menor:", error);

                //Declaramos el objeto miElipse de Elipse.java
                Elipse miElipse1 = new Elipse(ejeMayorC1, ejeMenorC1);
                //Aplicamos al metodo área de Elipse.java
                double perimResultado = miElipse1.perimetro();
                System.out.println(perimResultado);

                break;
            case 2:
                System.out.println("Usted eligió: " + opcionUsr);
                double ejeMayorC2 = getDoubleSimple("Ingrese el valor del eje mayor:", error);
                double ejeMenorC2 = getDoubleSimple("Ingrese el valor del eje menor:", error);

                //Declaramos el objeto miElipse de Elipse.java
                Elipse miElipse2 = new Elipse(ejeMayorC2, ejeMenorC2);
                //Aplicamos al metodo área de Elipse.java
                double areaResultado = miElipse2.area();
                System.out.println(areaResultado);
                break;
            case 3:
                System.out.println("Usted eligió: " + opcionUsr);
                
                break;
            case 0:
                System.out.println(opcionUsr);
                i = false;
                break;
            }

        }while (i == true);
    }

}
