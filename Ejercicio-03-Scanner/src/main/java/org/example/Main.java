package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //EJERCICIO 1:
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.println(nombre.toUpperCase() + " " + apellido.toUpperCase());

        //EJERCICIO 2:
        System.out.println("Vamos a calcular el area de un rectangulo");
        System.out.println("Ingrese la base del rectangulo: ");
        Integer base = scanner.nextInt();
        System.out.println("ingrese la altura del rectangulo: ");
        Integer altura = scanner.nextInt();
        System.out.println("La base del rectangulo es: " + base * altura);

        //EJERCICIO 3:
        System.out.println("Vamos a calcular los meses y días que ha vivido");
        System.out.println("Ingrese su edad: ");
        Integer edad = scanner.nextInt();
        System.out.println("has vivido aproximadamente: " + edad * 12 + " Meses y " + edad * 365 + " días" );

    }
}