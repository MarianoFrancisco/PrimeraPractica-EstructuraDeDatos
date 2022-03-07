/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.objeto;

import static com.mycompany.practica1estructura.frame.SeleccionarOrdenApuesta.c;
import static com.mycompany.practica1estructura.frame.VerResultados.resultadosTable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano
 */
public class LlenarResultados {
    public static void completarTablaResultados(Apostador[] apostadores,JTable resultadosTable) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        //definimos tabla
        resultadosTable.setModel(modeloTabla);
        //añadimos columnas
        modeloTabla.addColumn("NOMBRE APOSTADOR");
        modeloTabla.addColumn("MONTO");
        for (int i = 0; i < 10; i++) {
            modeloTabla.addColumn(c[i]);
        } 
        modeloTabla.addColumn("PUNTEO");
        resultadosTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        resultadosTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        //llenamos filas
        for (Apostador resultadoApuesta : apostadores) {
            if(resultadoApuesta!=null){
                modeloTabla.addRow(new Object[]{resultadoApuesta.getNombre(),resultadoApuesta.getMonto(),
                    resultadoApuesta.getPrimero(),resultadoApuesta.getSegundo(),resultadoApuesta.getTercero(),
                    resultadoApuesta.getCuarto(),resultadoApuesta.getQuinto(), resultadoApuesta.getSexto(),
                    resultadoApuesta.getSeptimo(),resultadoApuesta.getOctavo(),resultadoApuesta.getNoveno(),
                    resultadoApuesta.getDecimo(),resultadoApuesta.getPunteo()});
            }
        }
    }


}
