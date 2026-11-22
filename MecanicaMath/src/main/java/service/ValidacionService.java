package service;

import model.Funcion;
import model.Intervalo;

public class ValidacionService {

    public boolean validarFuncion(Funcion funcion) {

        if (funcion.getExpresion() == null) {
            System.out.println("debes ingresar una funcion: ");

        } else {
            System.out.println("la funcion cumple. ");
        }
        return true;
    }

    public boolean validarIntervalo(Intervalo intervalo) {
        // si f(x) > 0 la funcion crece
        // si f(x) < 0 la funcion decrece
        return true;
    }

    public boolean validarDominio(Funcion funcion, Intervalo intervalo) {
        return true;
    }
}
