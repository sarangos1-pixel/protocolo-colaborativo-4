/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author Sebastian
 */
public class DocumentoWord extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Word: " + contenido);
    }
}
