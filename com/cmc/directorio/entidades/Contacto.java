package com.cmc.directorio.entidades;

public class Contacto {

    private String nombre;

    private String apellido;

    private boolean activo;

    private Telefono telefono;

    private double peso;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Telefono getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Contacto(String nombre,String apellido, Telefono telefono , double peso){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.peso=peso;

    this.activo=true;
    }


    public Contacto(String nombre, String apellido, boolean activo, Telefono telefono, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.telefono = telefono;
        this.peso = peso;
    }
}
