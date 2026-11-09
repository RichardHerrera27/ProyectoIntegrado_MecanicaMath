/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author RDHHi
 */
public enum EscenarioMecanico {
    MOVIMIENTO,
    RENDIMIENTO,
    MECANIZADO;

    public String movimiento() {
        return "MOVIMIENTO";
    }

    public String rendimiento() {
        return "RENDIMIENTO";

    }

    public String mecanizado() {
        return "MEZANIDO";
    }
}
