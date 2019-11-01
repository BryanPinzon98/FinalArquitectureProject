
package parcialtecnicas;


public class ViviendaApartamento extends Inmueble{
    
    private int numeroParqueaderos;
    private int piso;

    public ViviendaApartamento(int id, int tipo, int metrosCuadradosConstruidos, int estrato, int valorBaseMetroCuadrado, int numeroParqueaderos, int piso) {
        super(id, tipo, metrosCuadradosConstruidos, estrato, valorBaseMetroCuadrado);
        this.numeroParqueaderos=numeroParqueaderos;
        this.piso=piso;
    }

    public int getNumeroParqueaderos() {
        return numeroParqueaderos;
    }

    public void setNumeroParqueaderos(int numeroParqueaderos) {
        this.numeroParqueaderos = numeroParqueaderos;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    
    
}
