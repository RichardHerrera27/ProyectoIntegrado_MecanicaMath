package service;

import model.Funcion;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.reflection.system.Solve;

public class DerivadaService {

    ExprEvaluator evaluator = new ExprEvaluator();

    String valorFuncionOriginal;
    String valorPrimeraDerivada;
    String valorPuntosCriticos;

    public DerivadaService(String valorFuncionOriginal, String valorPrimeraDerivada, String valorPuntosCriticos) {
        this.valorFuncionOriginal = valorFuncionOriginal;
        this.valorPrimeraDerivada = valorPrimeraDerivada;
        this.valorPuntosCriticos = valorPuntosCriticos;
    }

    public DerivadaService() {
    }
    

    public ExprEvaluator getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(ExprEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public String getValorFuncionOriginal() {
        return valorFuncionOriginal;
    }

    public void setValorFuncionOriginal(String valorFuncionOriginal) {
        this.valorFuncionOriginal = valorFuncionOriginal;
    }

    public String getValorPrimeraDerivada() {
        return valorPrimeraDerivada;
    }

    public void setValorPrimeraDerivada(String valorPrimeraDerivada) {
        this.valorPrimeraDerivada = valorPrimeraDerivada;
    }

    public String getValorPuntosCriticos() {
        return valorPuntosCriticos;
    }

    public void setValorPuntosCriticos(String valorPuntosCriticos) {
        this.valorPuntosCriticos = valorPuntosCriticos;
    }

    public String calcularPrimeraDerivada(Funcion funcion) {

//        valorFuncionOriginal = funcion.getExpresion().toString();

        IExpr primeraDerivada = evaluator.eval("D(" + funcion.getExpresion() + ", x)");
        valorPrimeraDerivada = primeraDerivada.toString();

        return "la primera derivada es: f'(x) = " + primeraDerivada.toString();
    }

    public String calcularPrimeraDerivada(Funcion[] fs) {

        return "";
    }

    public String calcularSegundaDerivada(Funcion funcion) {

        IExpr segundaDerivada = evaluator.eval("D(" + funcion.getExpresion() + ", {x, 2})");

        return "la segunda derivada es: f''(x) = " + segundaDerivada.toString();
    }

    public String evaluar(Funcion funcion, String expresion, double x) {
        // vamos a evaluar los puntos criticos para la funcion
        //"Solve(D(" + x^3 - 3*x^2 + 1 + ", x") + " == 0, x)"

        System.out.println("el valor de la primera derivada es: " + valorPrimeraDerivada);
        IExpr puntoCriticos = evaluator.eval("Solve(" + valorPrimeraDerivada + " == 0, x)");

        valorPuntosCriticos = puntoCriticos.toString();
        
        IExpr coordenadasY = evaluator.eval("ReplaceAll(" + valorFuncionOriginal + ", "
                + valorPuntosCriticos + ")");
        System.out.println("los valores en y son: " + coordenadasY);

        return "el valor de puntos criticos en x es : " + puntoCriticos.toString();
    }

    public double evaluar(Funcion[] funcion, String expresion, double x, int dimension) {
        // tomar un valor del vector la funcion
        // de su f'(x) analizar sus puntos criticos
        // igualamos a 0 para obtener esos puntos

        return 0.0d;
    }
}
