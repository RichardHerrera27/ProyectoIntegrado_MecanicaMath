package model;

public class ResultadoAnalisis {

    private long id;
    private String primeraDerivada;
    private String segundaDerivada;
    private String Observaciones;

    public ResultadoAnalisis(String primeraDerivada, String segundaDerivada) {
        this.primeraDerivada = primeraDerivada;
        this.segundaDerivada = segundaDerivada;
    }
    
    
    public String obtenerResultado() {
        return "";
    }

    @Override
    public String toString() {
        return "ResultadoAnalisis{" + "primeraDerivada=" + primeraDerivada + ", segundaDerivada=" + segundaDerivada + '}';
    }
    
    
}
