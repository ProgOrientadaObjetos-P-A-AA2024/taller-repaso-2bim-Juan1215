package paquete3;

import paquete2.Comprador;
import paquete2.Vehiculo;

public class TipoSuv extends Vehiculo {

    private double porcentajeAdicional;
    private double seguroPersonas;

    public TipoSuv(Comprador pro, String ma, double precioB, double porA) {
        super(pro, ma, precioB);
        porcentajeAdicional = porA;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    public void establecerSeguroPersonas() {
        seguroPersonas = precioBase * (porcentajeAdicional / 100);
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Vehiculo Tipo Suv: \n "
                + "%s: \n"
                + "porcentajeAdicional: %.2f\n"
                + "Seguro de las Personas: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeAdicional,
                seguroPersonas,
                precioFinal);

        return cadena;
    }
}
