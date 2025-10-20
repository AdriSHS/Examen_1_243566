/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1_243566.Modelo;

/**
 *
 * @author Adria
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private String consultorio;
    private String dias;
    private String horas;

    public Medico(String nombre, String especialidad, String consultorio, String dias, String horas) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.dias = dias;
        this.horas = horas;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public String getConsultorio() { return consultorio; }
    public String getDias() { return dias; }
    public String getHoras() { return horas; }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}
