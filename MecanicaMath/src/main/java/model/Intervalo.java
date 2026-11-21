package model;

public class Intervalo {

    private double limiteInferior;
    private double limiteSuperior;

    public Intervalo(double limiteInferior, double limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public boolean validar(double limiteInferior, double limiteSuperior) {
        System.out.println("tus intervalos para la funcion son: " + limiteInferior + ";" + limiteSuperior);
        return true;
    }

    public boolean contiene(double x) {
        return true;
    }
}
