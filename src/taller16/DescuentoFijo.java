/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author Sebastian
 */
public class DescuentoFijo extends Descuento {
    private double valorFijo;

    public DescuentoFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public double descuento(double precioOriginal) {
        return Math.max(0, precioOriginal - valorFijo);
    }
}
