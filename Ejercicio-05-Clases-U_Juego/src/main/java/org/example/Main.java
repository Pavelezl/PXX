package org.example;

public class Main {
    public static void main(String[] args) {

        UsuarioJuego usuarioJuego = new UsuarioJuego("pablo","123",0.0,0);
        usuarioJuego.subirNivel();
        usuarioJuego.subirNivel();
        usuarioJuego.subirNivel();
        usuarioJuego.subirNivel();
        usuarioJuego.subirNivel();
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.aumentarPuntaje();
        System.out.println(usuarioJuego.getPuntaje());
        System.out.println(usuarioJuego.getNivel());

        usuarioJuego.bonus(5.0);
        System.out.println(usuarioJuego.getPuntaje());
    }
}