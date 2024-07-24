package paquete3;

import paquete2.Comprador;
import paquete2.Vehiculo;

public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(Comprador pro, String ma, double precioB, double porA,
            double valD, double segAM) {
        super(pro, ma, precioB);
        porcentajeDescuento = porA;
        valorDescuento = valD;
        seguroAdicionalMecanico = segAM;

    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void establecerValorDescuento(double n) {
        valorDescuento = n;
    }

    public void establecerSeguroAdicionalMecanico(double n) {
        seguroAdicionalMecanico = n;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicionalMecanico() {
        return seguroAdicionalMecanico;
    }
    
    @Override
    public void calcularPrecioFinal() {
        
    }
}
