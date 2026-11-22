package dao.daoimpl;

import java.util.Scanner;
import model.Funcion;

public class FuncionDAOImpl implements FuncionDAO {

    @Override
    public void insertarFuncion(Funcion funcion) {
        // el sistema comienza en 0 funciones
        // si ingresa una funcion el sistema registra el id de la funcion 
        // entonces idFuncion sera igual a 0 + 1
        funcion.getId();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la funcion: ");
        String insertarFuncion = sc.next();
        sc.nextLine();
        if (insertarFuncion != null) {
            funcion.setId(0 + 1);
        }

    }

    @Override
    public void guardarFuncion() {

    }

}
