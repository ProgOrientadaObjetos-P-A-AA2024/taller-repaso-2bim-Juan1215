
package paquete2;

import paquete2.Comprador;

public abstract class Vehiculo {
    
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;
    
    
    public Vehiculo(Comprador pro, String ma, double precioB) {
        propietario = pro;
        marca = ma;
        precioBase = precioB;
    }

    public void establecerPropietario(Comprador n) {
        propietario = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public void establecerPrecioFinal(double n) {
        precioFinal = n;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public abstract void calcularPrecioFinal();
    
    
}
