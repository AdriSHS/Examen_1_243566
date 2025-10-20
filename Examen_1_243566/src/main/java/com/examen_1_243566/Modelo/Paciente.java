/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1_243566.Modelo;

/**
 *
 * @author Adria
 */
public class Paciente {
    private String nss;
    private String nombre;
    private int edad;
    private String domicilio;
    private boolean tieneSeguro;
    private String curp;
    private String tipoSangre;

    public Paciente(String nss, String nombre, int edad, String domicilio, boolean tieneSeguro, String curp, String tipoSangre) {
        this.nss = nss;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.tieneSeguro = tieneSeguro;
        this.curp = curp;
        this.tipoSangre = tipoSangre;
    }

    public String getNss() { return nss; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDomicilio() { return domicilio; }
    public boolean isTieneSeguro() { return tieneSeguro; }
    public String getCurp() { return curp; }
    public String getTipoSangre() { return tipoSangre; }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nDomicilio: " + domicilio +
               "\nSeguro: " + (tieneSeguro ? "Sí" : "No") +
               "\nCURP: " + curp +
               "\nTipo de sangre: " + tipoSangre;
    }
}

