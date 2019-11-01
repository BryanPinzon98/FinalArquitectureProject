
package parcialtecnicas;


public class ViviendaCasa extends Inmueble{
    
    private int numeroParqueaderos;
    private boolean vigilanciaPrivada;

    public ViviendaCasa(int id, int tipo, int metrosCuadradosConstruidos, int estrato, int valorBaseMetroCuadrado, int numeroParqueaderos, boolean vigilanciaPrivada) {
        super(id, tipo, metrosCuadradosConstruidos, estrato, valorBaseMetroCuadrado);
        this.numeroParqueaderos = numeroParqueaderos;
        this.vigilanciaPrivada = vigilanciaPrivada;
    }

    public int getNumeroParqueaderos() {
        return numeroParqueaderos;
    }

    public void setNumeroParqueaderos(int numeroParqueaderos) {
        this.numeroParqueaderos = numeroParqueaderos;
    }

    public boolean isVigilanciaPrivada() {
        return vigilanciaPrivada;
    }

    public void setVigilanciaPrivada(boolean vigilanciaPrivada) {
        this.vigilanciaPrivada = vigilanciaPrivada;
    }
    
    
    
}
