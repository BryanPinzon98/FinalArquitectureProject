package parcialtecnicas;

import java.util.*;

public class Inmueble {

    private int id;
    private int tipo;
    private int metrosCuadradosConstruidos;
    private int estrato;
    private int valorBaseMetroCuadrado;

    public Inmueble(int id, int tipo, int metrosCuadradosConstruidos, int estrato, int valorBaseMetroCuadrado) {
        this.id = id;
        this.tipo = tipo;
        this.metrosCuadradosConstruidos = metrosCuadradosConstruidos;
        this.estrato = estrato;
        this.valorBaseMetroCuadrado = valorBaseMetroCuadrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getMetrosCuadradosConstruidos() {
        return metrosCuadradosConstruidos;
    }

    public void setMetrosCuadradosConstruidos(int metrosCuadradosConstruidos) {
        this.metrosCuadradosConstruidos = metrosCuadradosConstruidos;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getValorBaseMetroCuadrado() {
        return valorBaseMetroCuadrado;
    }

    public void setValorBaseMetroCuadrado(int valorBaseMetroCuadrado) {
        this.valorBaseMetroCuadrado = valorBaseMetroCuadrado;
    }

}
