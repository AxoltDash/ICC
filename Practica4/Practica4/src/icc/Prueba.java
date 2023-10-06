
package icc;

import java.util.Scanner;

import icc.colors.Colors;
import icc.figuras.Circulo;
import icc.figuras.Elipse;
import icc.figuras.Lineas;


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
        Scanner scn = new Scanner(System.in);

        //Declaramos las variables que usaremos para los métodos anteriores
        int opcion;
        String mensaje, error;
        StringBuilder sb;

        //Valor para repetir el while (Si es true si se repite)
        boolean i = true;

        //Introducción al programa
        Colors.println("\t////////////////////////////////////////////", Colors.GREEN);
        Colors.println("\t//¡BIENVENIDO AL PROGRAMA CALULCA-ELIPSES!//", Colors.GREEN + Colors.HIGH_INTENSITY);
        Colors.println("\t////////////////////////////////////////////", Colors.GREEN);
        //Hice una clase que hace líneas para mantener organizada la terminal:
        Lineas lineas = new Lineas();

        //Ciclo que ejecuta infinitamente hasta que i = false
        do{
            lineas.EpicaLn();
            //Presentación de opciones:
            Colors.println("Las opciónes son:",  Colors.HIGH_INTENSITY);
            Colors.println("\t1. Obtener el perímetro de una elpise.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t2. Obtener el área de una elipse.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t3. Revisar si un circulo se encuentra en el borde de una elipse.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            Colors.println("\t0. Finalizar el programa.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
            lineas.Epica();

            //Se declara error ya que se usa varias veces en los métodos
            error = "Por favor, ingrese un número válido.";
            
            //Obtenemos la opción del jugador
            int opcionUsr = getInt("Por favor, ingrese el núm. de la opción deseada:", error, 0, 3);
            lineas.Epica();

            /*Activamos el switch para ejecutar opción del usuario,
            cabe aclarar que depende del caso al final de las variables
            se le da el numero del caso*/
            switch (opcionUsr){

            //Si queremos calcular perímetro:
            case 1:
                System.out.println("Usted eligió: " + opcionUsr);
                double ejeMayorC1 = getDoubleSimple("Ingrese el valor del eje mayor:", error);
                double ejeMenorC1 = getDoubleSimple("Ingrese el valor del eje menor:", error);

                //Declaramos el objeto miElipse1 de Elipse.java
                Elipse miElipse1 = new Elipse(ejeMayorC1, ejeMenorC1);

                /*Aplicamos métodos para obtener el real ejeMayor y ejeMenor
                por si el usuraio los puso en desorden, esto es meramente
                para que se vea bien la terminal*/
                double ejeMayRespC1 = miElipse1.ejeMayor();
                double ejeMenRespC1 = miElipse1.ejeMenor();
                
                //-------------------
                //Aplicamos al metodo área de Elipse.java
                double perimetroResultado = miElipse1.area();
                //-------------------

                Colors.println("Su eje mayor es: "+ejeMayRespC1,  Colors.BLUE);
                Colors.println("Su eje menor es: "+ejeMenRespC1,  Colors.BLUE);
                Colors.println("El perímetro es: "+ perimetroResultado,  Colors.HIGH_INTENSITY);
                break;


            //Si queremos calcular el área
            case 2:
                System.out.println("Usted eligió: " + opcionUsr);
                double ejeMayorC2 = getDoubleSimple("Ingrese el valor del eje mayor:", error);
                double ejeMenorC2 = getDoubleSimple("Ingrese el valor del eje menor:", error);
                //Declaramos el objeto miElipse2 de Elipse.java
                Elipse miElipse2 = new Elipse(ejeMayorC2, ejeMenorC2);
                
                /*Aplicamos métodos para obtener el real ejeMayor y ejeMenor
                por si el usuraio los puso en desorden, esto es meramente
                para que se vea bien la terminal*/
                double ejeMayRespC2 = miElipse2.ejeMayor();
                double ejeMenRespC2 = miElipse2.ejeMenor();

                //-------------------
                //Aplicamos al metodo área de Elipse.java
                double areaResultado = miElipse2.area();
                //-------------------

                Colors.println("Su eje mayor es: "+ejeMayRespC2,  Colors.BLUE);
                Colors.println("Su eje menor es: "+ejeMenRespC2,  Colors.BLUE);
                Colors.println("El área es: "+ areaResultado,  Colors.HIGH_INTENSITY);
                break;


            //Si queremos comprobar si encaja
            case 3:
                System.out.println("Usted eligió: " + opcionUsr);
                double ejeMayorC3 = getDoubleSimple("Ingrese el valor del eje mayor:", error);
                double ejeMenorC3 = getDoubleSimple("Ingrese el valor del eje menor:", error);
                double radioC3 = getDoubleSimple("Ingrese el valor del radio del círculo:", error);
                //Declaramos el objetos miElipse3 de Elipse.java y miCirculo3 de Circulo,java
                Elipse miElipse3 = new Elipse(ejeMayorC3, ejeMenorC3);
                Circulo miCirculo3 = new Circulo(radioC3);

                /*Aplicamos métodos para obtener el real ejeMayor y ejeMenor
                por si el usuraio los puso en desorden, esto es meramente
                para que se vea bien la terminal*/
                double ejeMayRespC3 = miElipse3.ejeMayor();
                double ejeMenRespC3 = miElipse3.ejeMenor();

                //-------------------
                //Obtenemos si encaja (true) o no encaja (false), METODO:
                boolean encaja3 = miElipse3.encaja(miCirculo3);
                //-------------------

                //Imprimimos las respuestas
                Colors.println("Su eje mayor es: "+ejeMayRespC3,  Colors.BLUE);
                Colors.println("Su eje menor es: "+ejeMenRespC3,  Colors.BLUE);
                Colors.println("Su radio es: "+radioC3,  Colors.BLUE);

                //Hacemos un IF true o false de encaja3
                if (encaja3 == true){
                    Colors.println("¡El círculo encaja con el elipse!", Colors.GREEN + Colors.HIGH_INTENSITY);
                } else {
                    Colors.println("El círculo NO encaja con el elipse", Colors.RED + Colors.HIGH_INTENSITY);
                }
                break;


            //Si queremos terminar el ciclo declarando i = false
            case 0:
                System.out.println("Usted eligió: "+opcionUsr);
                Colors.println("¡HASTA LUEGO!", Colors.HIGH_INTENSITY);
                
                lineas.Epica();
                i = false;
                break;
            }

        }while (i == true);
    }
}
