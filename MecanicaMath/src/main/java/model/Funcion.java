package model;

public class Funcion {

    private long id;
    private String expresion;
    private String variable;

    public Funcion(long id, String expresion, String variable) {
        this.id = id;
        this.expresion = expresion;
        this.variable = variable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", expresion=" + expresion + ", variable=" + variable + '}';
    }

}
