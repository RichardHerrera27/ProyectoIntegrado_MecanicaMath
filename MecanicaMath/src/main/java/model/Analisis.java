package model;

import java.time.LocalDateTime;

public class Analisis {

    private long id;
    private EscenarioMecanico escenario;
    private String expresion;
    private String variable;
    private double limiteInferior;
    private double limiteSuperior;
    private LocalDateTime fechaCreacion;

    public String obtenerResumen() {
        return "";
    }
}
