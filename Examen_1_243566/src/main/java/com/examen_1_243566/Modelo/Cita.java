/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1_243566.Modelo;

import java.time.LocalDateTime;
/**
 *
 * @author Adria
 */
public class Cita {
     private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHora;

    public Cita(Paciente paciente, Medico medico, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return "Cita de " + paciente.getNombre() + " con Dr. " + medico.getNombre() +
               " el " + fechaHora.toString();
    }
}
