package ec.edu.espoch.mecanicamath;

import java.util.Scanner;
import model.EscenarioMecanico;
import model.Funcion;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;

public class MecanicaMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("elige una opciones entre el 1. RENDIMIENTO"
                + " 2. MOVIMIENTO"
                + " 3. MECANIZADO : ");
        int opciones = sc.nextInt();

        switch (opciones) {
            case 1:
                System.out.println("tu seleccion es:" + EscenarioMecanico.RENDIMIENTO);
                System.out.println("Ingresa la funcion que deseas analizar");
                String funcion = sc.nextLine();
                if (funcion != sc.nextLine()) {
                    System.out.println("error");

                }
                System.out.println("tu funcion es : " + funcion);
                sc.nextLine();

                break;
            case 2:
                System.out.println("tu seleccion es: " + EscenarioMecanico.MOVIMIENTO);
            case 3:
                System.out.println("tu seleccion es: " + EscenarioMecanico.MECANIZADO);
            default:
                throw new AssertionError();
        }

        // Inicializa el motor de Symja
//        ExprEvaluator util = new ExprEvaluator();
//
//        String derivadaSimple = "D(3*x^2 + 5x,x)";
//        IExpr res1 = util.eval(derivadaSimple);
//        System.out.println("Primera derivada es: " + res1);
//
//        String segundaDerivada = "D(x^4 + x^3, {x,2})";
//        IExpr res2 = util.eval(segundaDerivada);
//        System.out.println("Segunda derivada es: " + res2);
//
//        Funcion funcion = new Funcion(0, segundaDerivada, res2.toString());
//        System.out.println("objeto funcion creado con exito para pruebas");
//        funcion.getExpresion();
//        System.out.println(funcion.getVariable());
//        System.out.println(funcion.getId());
    }
}
