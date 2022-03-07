/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.lectura_archivo;

import com.mycompany.practica1estructura.objeto.Apostador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */

public class CargaArchivo {
    public static Apostador[] apostadores;
    public void leer(File archivo, JTextArea texto) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Creamos un metodo con parametros archivo y text area que se ingresaran en inicio
        FileReader leerA = new FileReader(archivo);//ingresamos archivo
        BufferedReader leerTA = new BufferedReader(leerA);//lector del archivo
        String linea;
        //indicamos que lea linea por linea e imprima en el text area   
        while ((linea = leerTA.readLine()) != null) {//O(n)
                        texto.append(linea+"\n");
        }                  
     }      
}
