
package icc;
import java.util.Scanner;
import icc.colors.Colors;

import icc.conversiones.CelsiusToFahrenheit;
import icc.conversiones.FahrenheitToCelsius;


public class Prueba {
    
    public static int getIntTry(String mensaje, String error, int min, int max) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            try {
                Colors.println(mensaje, Colors.HIGH_INTENSITY);
                if (scn.hasNextInt()) {
                    int val = scn.nextInt();
                    if (val < min || max < val) {
                        throw new IllegalArgumentException(); // Lanzar una excepción si el valor no está en el rango
                    } else {
                        return val;
                    }
                } else {
                    scn.next();
                    throw new IllegalArgumentException(); // Lanzar una excepción si no se ingresa un número entero
                }
            } catch (IllegalArgumentException e) {
                // Manejar la excepción específica para valores fuera del rango o no enteros
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        }
    }

    public static double getDoubleTry(String mensaje, String error, double min) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            try {
                Colors.println(mensaje, Colors.YELLOW + Colors.HIGH_INTENSITY);
                if (scn.hasNextDouble()) {
                    double val = scn.nextDouble();
                    if (val < min) {
                        throw new IllegalArgumentException(); // Lanzar una excepción si el valor no está en el rango
                    } else {
                        return val;
                    }
                } else {
                    scn.next();
                    throw new IllegalArgumentException(); // Lanzar una excepción si no se ingresa un número entero
                }
            } catch (IllegalArgumentException e) {
                // Manejar la excepción específica para valores fuera del rango o no enteros
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        }
    }

    public static void printEpicLine(String theString){
        int longString = theString.length();
        for(int i = 0 ; i < longString; i++){
            Colors.print("=", Colors.CYAN + Colors.HIGH_INTENSITY);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Colors.println("  ////////////////////////////////", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        Colors.println("////¡BIENVENID@ A LA PRACTICA 07////", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        Colors.println("  ////////////////////////////////", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        System.out.println();
        
        boolean menu = true;
        int opcionInt;

        //Menú:
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("\nSeleccione la opción que guste realizar.\n");
        sb.append("1. Celsius a Fahrenheit.\n");
        sb.append("2. Fahrenheit a Celsius.\n");
        sb.append("0. Salir.\n\n");
        sb.append("Eslija una opcion:");

        StringBuilder sb1;
        sb1 = new StringBuilder();
        sb1.append("\nIngresa los grados en Celsius que quieres convertir a Fahrenheit:\n");
        sb1.append("Por favor no ingreses valores menores a \"-273.15\"");
        
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append("\nIngresa los grados en Fahrenheit que quieres convertir a Celsius:\n");
        sb2.append("Por favor no ingreses valores menores a \"-459.67\"");

        CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
        FahrenheitToCelsius fc = new FahrenheitToCelsius();

        //Inicia el ciclo del programa para converisones:
        do {
            opcionInt = getIntTry(sb.toString(), "Por favor, ingrese un número válido.", 0, 2);
            switch(opcionInt){
                case 1: //Celsius to Fahrenheit
                    double CelToFahDouble = getDoubleTry(sb1.toString(), "Por favor, ingrese un valor válido.", -273.15);
                    
                    printEpicLine(CelToFahDouble + "°" + " Celsius son: " + String.format("%.3f", fc.convert(CelToFahDouble)) + "°" + " Fahrenheit");

                    Colors.print(CelToFahDouble + "°", Colors.GREEN + Colors.HIGH_INTENSITY);
                    Colors.print(" Celsius son: ", Colors.HIGH_INTENSITY);
                    Colors.print(String.format("%.3f", fc.convert(CelToFahDouble)) + "°", Colors.GREEN + Colors.HIGH_INTENSITY);
                    Colors.print(" Fahrenheit", Colors.HIGH_INTENSITY);
                    System.out.println();
                    
                    printEpicLine(CelToFahDouble + "°" + " Fahrenheit son: " + String.format("%.3f", fc.convert(CelToFahDouble)) + "°" + " Celsius");

                    break;
                case 2: //Fahrenheit to Celsius
                    double FahToCelDouble = getDoubleTry(sb2.toString(), "Por favor, ingrese un valor válido.", -459.67);

                    printEpicLine(FahToCelDouble + "°" + " Fahrenheit son: " + String.format("%.3f", fc.convert(FahToCelDouble)) + "°" + " Celsius");
                    
                    Colors.print(FahToCelDouble + "°", Colors.GREEN + Colors.HIGH_INTENSITY);
                    Colors.print(" Fahrenheit son: ", Colors.HIGH_INTENSITY);
                    Colors.print(String.format("%.3f", fc.convert(FahToCelDouble)) + "°", Colors.GREEN + Colors.HIGH_INTENSITY);
                    Colors.print(" Celsius", Colors.HIGH_INTENSITY);
                    System.out.println();
                    
                    printEpicLine(FahToCelDouble + "°" + " Fahrenheit son: " + String.format("%.3f", fc.convert(FahToCelDouble)) + "°" + " Celsius");

                    break;
                case 0:
                    menu = false;
                    Colors.println("¡Gracias por ejecutar! Hasta pronto", Colors.BLUE + Colors.HIGH_INTENSITY);
                    break;
            }
        } while (menu == true);
    }
}