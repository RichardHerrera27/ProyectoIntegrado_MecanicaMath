package ec.edu.espoch.mecanicamath;

import dao.daoimpl.FuncionDAOImpl;
import model.Funcion;
import model.PuntoCritico;
import org.matheclipse.core.reflection.system.Solve;
import service.DerivadaService;

public class TestCodeMecanicaMath {

    public static void main(String[] args) {

        Funcion[] funcionPrueba;
        funcionPrueba = new Funcion[1];

        funcionPrueba[0] = new Funcion(1, "3x^2+6x", "x");

        for (Funcion f : funcionPrueba) {
            System.out.println("[" + f + "]");
        }
        String funcionCalculo = funcionPrueba[0].getExpresion();

        System.out.println(funcionCalculo);
        DerivadaService ds = new DerivadaService();
        String primeraDerivada = ds.calcularPrimeraDerivada(funcionPrueba);
        
        PuntoCritico critico = new PuntoCritico();
        critico.obtenerPuntos(ds);
        critico.obtenerCoordenadasY(ds);
        

        //punto critico admite el valor de una funcion
        Funcion funcion = new Funcion(funcionCalculo);

        System.out.println("la f(x) es: " + funcionPrueba[0].getExpresion()
                + ds.calcularPrimeraDerivada(funcionPrueba[0]));

        String puntoCriti = ds.evaluar(funcion, primeraDerivada, 0);
        System.out.println(puntoCriti);
        
        //apartado para insertar funciones
        FuncionDAOImpl impl = new FuncionDAOImpl();
        impl.guardarFuncion();
    }
}
