package model;

/*
solicitamos el ingreso al usuario de los limites inferiores y superiores
para tener un limite de hasta donde vamos a evaluar la funcion en que puntos

porque lo hacemos?
1. encontrar los exremos absolutos
2. evitamos bucle infinitos en funciones periodicas
3. nos ayuda para renderizar nuestra grafica

 */
public class Intervalo {

    private double limiteInferior = -10;
    private double limiteSuperior = 10;

    public Intervalo(double limiteInferior, double limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public boolean validar(double limiteInferior, double limiteSuperior) {
        if (limiteInferior < limiteSuperior) {

        } else {
            System.out.println("el limite inferior no puede ser mayor al limite superior");
        }
        return true;
    }

    public boolean contiene(double x) {
        return true;
    }
}
