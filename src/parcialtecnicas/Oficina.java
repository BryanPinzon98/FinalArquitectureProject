
package parcialtecnicas;


public class Oficina extends Inmueble{
    
    private boolean parqueaderoVisitante;
    

    public Oficina(int id, int tipo, int metrosCuadradosConstruidos, int estrato, int valorBaseMetroCuadrado, boolean parqueaderoVisitante) {
        super(id, tipo, metrosCuadradosConstruidos, estrato, valorBaseMetroCuadrado);
        this.parqueaderoVisitante = parqueaderoVisitante;
    }

    public boolean isParqueaderoVisitante() {
        return parqueaderoVisitante;
    }

    public void setParqueaderoVisitante(boolean parqueaderoVisitante) {
        this.parqueaderoVisitante = parqueaderoVisitante;
    }
    
    
    
}
