package service;

import model.Funcion;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;

public class DerivadaService {

    ExprEvaluator evaluator = new ExprEvaluator();

    public String calcularPrimeraDerivada(Funcion funcion) {

        IExpr primeraDerivada = evaluator.eval("D(" + funcion.getExpresion() + ", x)");

        return "la primera derivada es: f'(x) = " + primeraDerivada.toString();
    }

    public String calcularSegundaDerivada(Funcion funcion) {

        IExpr segundaDerivada = evaluator.eval("D(" + funcion.getExpresion() + ", {x, 2})");

        return "la segunda derivada es: f''(x) = " + segundaDerivada.toString();
    }

    public double evaluar(Funcion funcion, String expresion, double x) {
        // vamos a evaluar los puntos criticos para la funcion

        IExpr resolucion = evaluator.eval("Solve(" + calcularPrimeraDerivada(funcion.getExpresion()))
        
        return 0.0d;
    }
}
