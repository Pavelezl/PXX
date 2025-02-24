package org.example;

public class Main {
    public static void main(String[] args) {
        Personaje jugador1 = new Personaje("Héroe", 100, 20);
        Personaje enemigo = new Personaje("Monstruo", 50, 15);

        jugador1.mostrarEstado();
        enemigo.mostrarEstado();

        jugador1.atacar(enemigo);
        enemigo.mostrarEstado();

        enemigo.atacar(jugador1);
        jugador1.mostrarEstado();

        jugador1.sanar();
        jugador1.mostrarEstado();
    }
}