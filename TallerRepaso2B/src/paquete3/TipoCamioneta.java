package paquete3;

import paquete2.*;

public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroAdicionalMantenimiento;

    public TipoCamioneta(Comprador pro, String ma, double precioB, double porAI,
            double vAI, double sAM) {
        super(pro, ma, precioB);
        porcentajeAdicionalImportacion = porAI;
        valorAdicionalImportacion = vAI;
        seguroAdicionalMantenimiento = sAM;

    }

    public void setPorcentajeAdicionalImportacion(double n) {
        porcentajeAdicionalImportacion = n;
    }

    public void setValorAdicionalImportacion(double n) {
        valorAdicionalImportacion = n;
    }

    public void setSeguroAdicionalMantenimiento(double n) {
        seguroAdicionalMantenimiento = n;
    }

    public double getPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double getValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double getSeguroAdicionalMantenimiento() {
        return seguroAdicionalMantenimiento;
    }
    
    @Override
    public void calcularPrecioFinal() {
        
    }

}
