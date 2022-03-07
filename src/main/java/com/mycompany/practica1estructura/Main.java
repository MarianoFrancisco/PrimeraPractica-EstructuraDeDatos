/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura;

import com.mycompany.practica1estructura.controladores.MovilizadorDatos;
import com.mycompany.practica1estructura.controladores.MovilizadorServicios;
import com.mycompany.practica1estructura.frame.Inicio;

/**
 *
 * @author Mariano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //inicializamos estructuradores de datos
                MovilizadorDatos.crearMovilizador();//llamamos a movilizar datos
                MovilizadorServicios.crearMovilizadorServicios();//movilizar datos reportes
                //iniciamos frame inicio
                new Inicio().setVisible(true);      
            }
        });
    }
    
}
        