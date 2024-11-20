package es.travelworld.www.activ5intents;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String datousuario;
    private String datocontrasena;
    private String nombre;
    private String apellido;
    private int edades;

    public Usuario(String datousuario, String datocontrasena, String nombre, String apellido, int edades) {
        this.datousuario = datousuario;
        this.datocontrasena = datocontrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edades = edades;
    }
    public Usuario(String datousuario, String datocontrasena) {
        this.datousuario = datousuario;
        this.datocontrasena = datocontrasena;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "datousuario='" + datousuario + '\'' +
                ", datocontrasena='" + datocontrasena + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edades=" + edades +
                '}';
    }

    public String getDatousuario() {
        return datousuario;
    }

    public void setDatousuario(String datousuario) {
        this.datousuario = datousuario;
    }

    public String getDatocontrasena() {
        return datocontrasena;
    }

    public void setDatocontrasena(String datocontrasena) {
        this.datocontrasena = datocontrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdades() {
        return edades;
    }

    public void setEdades(int edades) {
        this.edades = edades;
    }
}