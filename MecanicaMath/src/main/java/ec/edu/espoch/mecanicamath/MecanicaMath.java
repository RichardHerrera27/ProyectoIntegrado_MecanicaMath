package ec.edu.espoch.mecanicamath;

import java.util.Scanner;
import model.Funcion;
import model.Intervalo;
import model.PuntoCritico;
import service.DerivadaService;
import service.ValidacionService;

public class MecanicaMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. el usuario selecciona el cqso de uso
        System.out.println("Selecciona el caso de uso :"
                + "1. MOVIMIENTO"
                + "2. RENDIMIENTO"
                + "3. MECANIZADO"
        );
        // 2. despues de seleccionar el caso de uso
        // usuario ingresa la funcion y define los intervalos

        System.out.println("Ingresa la funcion -> f(x) : ");
        String funcionUser = sc.nextLine();
        Funcion funcion = new Funcion(funcionUser);
        String funcionUsar = funcion.getExpresion();
        
        // necesitamos validar que la funcion sea correcta
        ValidacionService validacionService = new ValidacionService();
        validacionService.validarFuncion(funcion);
        
        // al validar la funcion obtenemos la f'(x)
        DerivadaService derivadaService = new DerivadaService();
        derivadaService.calcularPrimeraDerivada(funcion);
        
        //necesitamos encontrar los puntos criticos
        PuntoCritico critico = new PuntoCritico();
        critico.obtenerPuntos(derivadaService);

    }
}
