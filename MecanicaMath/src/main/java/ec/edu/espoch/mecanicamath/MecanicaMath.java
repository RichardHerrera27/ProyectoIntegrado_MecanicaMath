package ec.edu.espoch.mecanicamath;

import java.util.Scanner;
import model.Funcion;
import model.Intervalo;
import model.ResultadoAnalisis;
import service.DerivadaService;

public class MecanicaMath {

    public static void main(String[] args) {
        //en el contexto el usuario 1. elige el caso de uso
        // 2. ingresa una funcion

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la funcion - f(x) = ");
        String input = sc.nextLine();

        Funcion funcion = new Funcion(input);
        System.out.println(" f(x) = " + funcion.getExpresion());
        System.out.println("D(" + funcion.getExpresion() + ", x)");

        DerivadaService ds = new DerivadaService();
        System.out.println(ds.calcularPrimeraDerivada(funcion));
        System.out.println(ds.calcularSegundaDerivada(funcion));

        System.out.println("ingresa el limite inferior para la f(x) = ");
        int limiteInferior = sc.nextInt();
        System.out.println("ingresa el limite superior para la f(x) = ");
        int limiteSuperior = sc.nextInt();

        Intervalo intervalo = new Intervalo(limiteInferior, limiteSuperior);
        intervalo.validar(limiteInferior, limiteSuperior);

        ResultadoAnalisis analisis = new ResultadoAnalisis(ds.calcularPrimeraDerivada(funcion), ds.calcularSegundaDerivada(funcion));
        analisis.toString();
    }
}
