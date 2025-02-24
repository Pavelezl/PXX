package org.example;

public class Personaje {

    private String nombre;
    private Integer vida;
    private Integer fuerza;

    public Personaje(String nombre, Integer vida, Integer fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public void atacar(Personaje objetivo) {
        if (objetivo.vida > 0) {
            objetivo.setVida(objetivo.vida - this.fuerza);
            System.out.println(nombre + " atacó a " + objetivo.nombre + " causando " + fuerza + " de daño.");
        } else {
            System.out.println("El personaje " + objetivo.nombre + " ya está muerto.");
        }
    }

    public void sanar() {
        vida = Math.min(vida + 20, 100);
        System.out.println(nombre + " se ha curado. Vida actual: " + vida);
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + " | Salud: " + vida + " | Fuerza: " + fuerza);
    }

    public void setVida(Integer vida) {
        this.vida = Math.max(vida, 0);
    }
}
