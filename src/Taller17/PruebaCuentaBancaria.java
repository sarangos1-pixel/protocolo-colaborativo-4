/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller17;

/**
 *
 * @author Sebastian
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaNormal = new CuentaBancaria(4000);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(4000);

        cuentaNormal.retirar(500);
        cuentaAhorros.retirar(500); 
    }
}
