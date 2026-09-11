package Laytons;

import java.util.Scanner;

public class Utilidades {

    public static int leerEnteroPositivo(Scanner entrada, String mensaje) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            try {
                String linea = entrada.nextLine();
                numero = Integer.parseInt(linea);
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println(" Debe Ingresar un número mayor a cero. ");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error: Debe ingresar un número entero válido. ");
            }
        }
    }

    public static double leerDoubleNegativo(Scanner entrada, String mensaje) {
        double numero;
        while (true) {
            System.out.println(mensaje);
            try {
                String linea = entrada.nextLine(); // Leemos todo el texto
                numero = Double.parseDouble(linea); // Convertimos a decimal
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println(" Debe Ingresar Valor no Negativo.. ");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error!! Ingrese un numero Valido (ej: 5000.0) ");
            }
        }
    }

    public static String leerTextoNoVacio(Scanner entrada, String mensaje) {

        String texto;
        while (true) {
            System.out.println(mensaje);
            texto = entrada.nextLine();

            if (!texto.trim().isEmpty()) {
                return texto;
            } else {
                System.out.println(" Este campo no puede estar Vacio.. ");
            }
        }
    }

}
