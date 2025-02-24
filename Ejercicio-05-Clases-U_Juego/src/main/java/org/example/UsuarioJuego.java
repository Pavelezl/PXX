package org.example;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave, Double puntaje, Integer nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    public Double aumentarPuntaje(){
        return puntaje +=1;
    }

    public Integer subirNivel(){
        return nivel +=1;
    }

    public Double bonus(Double monto){
        return puntaje += monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
