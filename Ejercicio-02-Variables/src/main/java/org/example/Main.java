package org.example;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1: Mascotas
//        String queEs = "Perro";
//        String queEs1 = "Gato";
//
//        String nombre = "Manchitas";
//        String nombre1 = "Silvestre";
//
//        Integer edad = 2;
//        Integer edad1 = 3;
//
//        Double come = 1.5;
//        Double come1 = 0.5;
//
//        String sonido = "Gua gua";
//        String sonido1 = "miau miau";
//
//        System.out.println(nombre + " Tiene " + edad + " años.");
//        System.out.println(nombre + " come " + come + " kilos y hace " + sonido);
//
//        System.out.println(nombre1 + " Tiene " + edad1 + " años.");
//        System.out.println(nombre1 + " come " + come1 + " kilos y hace " + sonido1);

        //Ejercicio 2: Comparar dos cadenas de texto y ver si son iguales.
        String nombre = "Juan";
        String nombre1 = "Pedro";
        String nombre2 = "juan";

        if(nombre.equals(nombre2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("las cadenas son diferentes");
        }

    }
}