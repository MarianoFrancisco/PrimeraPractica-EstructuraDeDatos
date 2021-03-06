/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.lectura_archivo;


import static com.mycompany.practica1estructura.controladores.MovilizadorDatos.movilizar;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class ExportarArchivo {
    public static void exportarArchivo(JTextArea CargaArchivo) {
        try {
            // creamos metodo con text area de parametro
            JFileChooser archivo = new JFileChooser();//escogemos el archivo a leer
            archivo.showSaveDialog(null);
            if (archivo.getSelectedFile() != null) {
                //si seleccionamos el archivo escribimos en el text area y notificamos exito
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    movilizar.setDirectorio(archivo.getSelectedFile().getPath());
                    System.out.println(movilizar.getDirectorio());
                    guardado.write(CargaArchivo.getText());
                    JOptionPane.showMessageDialog(null, "El archivo fue guardado con éxito en la ruta establecida");
                }
                
            }
        } catch (IOException ex) {
        System.out.println("ex"+ex);
        }
        
    }
}
