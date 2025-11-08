/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17;

/**
 *
 * @author Sebastian
 */
public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo * 0.9) { 
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar más del 90% del saldo en una cuenta de ahorros");
        }
    }
}
