/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.lectura_archivo;

import static com.mycompany.practica1estructura.controladores.MovilizadorDatos.movilizar;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class ReescribirArchivo {
    public static void reescribir(JTextArea CargaArchivo){
        if (movilizar.getDirectorio()!="") {
            try {    
            FileWriter reescribiendo = new FileWriter(movilizar.getDirectorio());
            System.out.println(movilizar.getDirectorio());
            reescribiendo.write(CargaArchivo.getText());
            reescribiendo.close();
            JOptionPane.showMessageDialog(null, "El archivo fue guardado con éxito");
        } catch (IOException ex) {
            Logger.getLogger(ReescribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            ExportarArchivo.exportarArchivo(CargaArchivo);//enviamos parametro para guardar archivo texto
        }
        
    }
}
