package org.umg.curso;

/**
 * Created by alumno on 27/06/2017.
 */
public class Deporte {

    String nombre;

    boolean balon;

    public Deporte() {

    }

    public Deporte(String nombre, boolean balon) {
        this.nombre = nombre;
        this.balon = balon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBalon() {
        return balon;
    }

    public void setBalon(boolean balon) {
        this.balon = balon;
    }
}
