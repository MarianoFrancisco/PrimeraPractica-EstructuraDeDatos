/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura;

import static com.mycompany.practica1estructura.controladores.MovilizadorDatos.movilizar;
import static com.mycompany.practica1estructura.frame.AnimacionCaballo.frameAnimacionCaballo;
import static com.mycompany.practica1estructura.frame.Inicio.apostadores;
import com.mycompany.practica1estructura.frame.SeleccionarOrdenApuesta;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class HiloAnimacion extends Thread implements Runnable{
    @Override
    public void run() {
        //creamos variables de modificacion
        int i=0;
        int k=0;
        int l=300;
        //creamos boton
        JButton p= new JButton();
        frameAnimacionCaballo.jPanel2.add(p);//anadimos el boton a panel animacion vuelo
        JOptionPane.showMessageDialog(null, "Empezamos Carrera");//mensaje amigable
        for ( i = 0; i < 7; i++) {     
            p.setVisible(true);//hacemos visible boton
            //asignamos imagen al boton
            p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CaballoAnimacion.png")));
            p.setBounds(k, l, 335, 237);//indicamos medidas de boton
            //modificamos valores de "x" y "y"
            k=k+70;
            l=l-50;
            try{//try catch por si ocurre error y damos tiempo de espera de 300milisegundos
                HiloAnimacion.sleep(300);
            }catch(InterruptedException e){
                System.out.println("Error en el hilo animacion "+e);
            }
            finally{
                p.setVisible(false);
            }
            if(i==5){
                for (int j = 0; j < 7; j++) {
                    p.setVisible(true);//hacemos visible boton
                    //asignamos imagen al boton
                    p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CaballoAnimacion.png")));
                    p.setBounds(k, l, 335, 237);//indicamos medidas de boton
                    //modificamos valores de "x" y "y"
                    k=k+70;
                    l=l+50;
                    try{//try catch por si ocurre error y damos tiempo de espera de 300milisegundos
                    HiloAnimacion.sleep(300);
                    }catch(InterruptedException e){
                    System.out.println("Error en el hilo animacion "+e);
                    }
                    finally{
                        p.setVisible(false);//hacemos invisible el boton
                    }
                }
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "Carrera finalizada");//mensaje amigable
        frameAnimacionCaballo.dispose();
        if (apostadores[0] != null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SeleccionarOrdenApuesta().setVisible(true);
                }
            });
        }
    }
}
