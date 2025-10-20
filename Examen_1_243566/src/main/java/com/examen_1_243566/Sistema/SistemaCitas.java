/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1_243566.Sistema;

import java.time.LocalDateTime;
import java.util.*;
import com.examen_1_243566.Modelo.*;
/**
 *
 * @author Adria
 */
public class SistemaCitas {

    private ArrayList<Medico> medicos;
    private Map<String, Paciente> basePacientes;

    public SistemaCitas() {
        // "Base de datos" interna simulada
        basePacientes = new HashMap<>();
        basePacientes.put("12345", new Paciente("12345", "Carlos Ramírez", 32, "Av. Reforma 101", true, "CARR890101HDFRMN07", "O+"));
        basePacientes.put("67890", new Paciente("67890", "María Gómez", 28, "Calle Hidalgo 22", false, "GOMM920512MDFRMA06", "A-"));
        basePacientes.put("54321", new Paciente("54321", "José Martínez", 40, "Col. Centro 55", true, "MARJ850101HDFRTS04", "B+"));
        basePacientes.put("243566", new Paciente("243566", "Adrian Omar Coronado Coronado", 21, "Col. Laureles 6", true, "COCA040827HSRRRDA6", "A+"));

        // Médicos disponibles
        medicos = new ArrayList<>();
        medicos.add(new Medico("Juan Pérez", "Cardiología", "A1", "Lun-Mié-Vie", "9:00AM - 2:00PM"));
        medicos.add(new Medico("Ana López", "Dermatología", "B3", "Mar-Jue", "10:00AM - 3:00PM"));
        medicos.add(new Medico("Luis Ramos", "Pediatría", "C2", "Lun-Vie", "8:00AM - 12:00PM"));
    }

    public Paciente buscarPaciente(String nss) {
        return basePacientes.get(nss);
    }

    public ArrayList<Medico> obtenerMedicos() {
        return medicos;
    }

    public Cita registrarCita(Paciente paciente, Medico medico, LocalDateTime fechaHora) {
        return new Cita(paciente, medico, fechaHora);
    }
}
