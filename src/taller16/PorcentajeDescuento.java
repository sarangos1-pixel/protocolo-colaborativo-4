/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author Sebastian
 */
public class PorcentajeDescuento extends Descuento {
    private double porcentaje;

    public PorcentajeDescuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double descuento(double precioOriginal) {
        return precioOriginal * (1 - porcentaje / 100);
    }
}
