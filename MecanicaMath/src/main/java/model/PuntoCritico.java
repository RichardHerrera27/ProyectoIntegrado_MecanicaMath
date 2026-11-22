package model;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import service.DerivadaService;

public class PuntoCritico {

    private long id;
    private double coodernadaX;
    private double coordenadaY;
    private String tipo;

    ExprEvaluator evaluator = new ExprEvaluator();

    public void obtenerPuntos(DerivadaService service) {
        //para obtener el valor de los puntos criticos
        // obtener el valor de la primera derivada
        // igualamos a 0

        service.getValorPrimeraDerivada();

        IExpr puntoCriticos = evaluator.eval("Solve(" + service.getValorPrimeraDerivada() + " == 0, x)");
        System.out.println("los puntos criticos son: " + puntoCriticos.toString());
    }

    public void obtenerCoordenadasY(DerivadaService service) {

        IExpr coordenadasY = evaluator.eval("ReplaceAll(" + service.getValorFuncionOriginal() + ", "
                + service.getValorPuntosCriticos() + ")");

        System.out.println("el valor de las coordenadas para Y son: " + coordenadasY);
    }

    public void obtenerCoordenadasY() {

    }

    public String obtenerTipo() {
        return "";
    }

}
