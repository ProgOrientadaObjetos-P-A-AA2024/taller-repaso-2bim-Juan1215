package paquete3;

import paquete2.Comprador;
import paquete2.Vehiculo;

public class TipoSuv extends Vehiculo {

    private double porcentajeAdicional;
    private double seguroPersonas;

    public TipoSuv(Comprador pro, String ma, double precioB, double pB, double porA) {
        super(pro, ma, precioB);
        porcentajeAdicional = porA;
        precioBase = pB;
    }

    public void setPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    public void setSeguroPersonas(double n) {
        seguroPersonas = n;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double getSeguroPersonas() {
        return seguroPersonas;
    }

    @Override
    public void calcularPrecioFinal() {
        seguroPersonas = precioBase * (porcentajeAdicional / 100);
        precioFinal = precioBase + seguroPersonas;
    }
}
