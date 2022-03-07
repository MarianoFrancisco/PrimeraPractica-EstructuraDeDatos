/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.objeto;

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
        modeloTabla.addColumn("PUNTEO");
        //llenamos filas
        for (Apostador resultadoApuesta : apostadores) {
            if(resultadoApuesta!=null){
                modeloTabla.addRow(new Object[]{resultadoApuesta.getNombre(),resultadoApuesta.getMonto(),resultadoApuesta.getPunteo()});
            }
        }
    }


}
