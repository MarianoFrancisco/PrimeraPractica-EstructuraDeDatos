/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.controladores;

/**
 *
 * @author Mariano
 */
public class MovilizadorServicios {
    private String s2TiempoPromedio;
    private String s2PromedioPasos;
    private String s2MayorPasos;
    private String s2MenorPasos;
    private String s3TiempoPromedio;
    private String s3PromedioPasos;
    private String s3MayorPasos;
    private String s3MenorPasos;
    private String s4TiempoPromedio;
    private String s4PromedioPasos;
    private String s4MayorPasos;
    private String s4MenorPasos;
    public static MovilizadorServicios movilizarServicios;
    public MovilizadorServicios(String s2TiempoPromedio, String s2PromedioPasos, String s2MayorPasos, String s2MenorPasos, String s3TiempoPromedio, String s3PromedioPasos, String s3MayorPasos, String s3MenorPasos, String s4TiempoPromedio, String s4PromedioPasos, String s4MayorPasos, String s4MenorPasos) {
        this.s2TiempoPromedio = s2TiempoPromedio;
        this.s2PromedioPasos = s2PromedioPasos;
        this.s2MayorPasos = s2MayorPasos;
        this.s2MenorPasos = s2MenorPasos;
        this.s3TiempoPromedio = s3TiempoPromedio;
        this.s3PromedioPasos = s3PromedioPasos;
        this.s3MayorPasos = s3MayorPasos;
        this.s3MenorPasos = s3MenorPasos;
        this.s4TiempoPromedio = s4TiempoPromedio;
        this.s4PromedioPasos = s4PromedioPasos;
        this.s4MayorPasos = s4MayorPasos;
        this.s4MenorPasos = s4MenorPasos;
    }

    public String getS2TiempoPromedio() {
        return s2TiempoPromedio;
    }

    public void setS2TiempoPromedio(String s2TiempoPromedio) {
        this.s2TiempoPromedio = s2TiempoPromedio;
    }

    public String getS2PromedioPasos() {
        return s2PromedioPasos;
    }

    public void setS2PromedioPasos(String s2PromedioPasos) {
        this.s2PromedioPasos = s2PromedioPasos;
    }

    public String getS2MayorPasos() {
        return s2MayorPasos;
    }

    public void setS2MayorPasos(String s2MayorPasos) {
        this.s2MayorPasos = s2MayorPasos;
    }

    public String getS2MenorPasos() {
        return s2MenorPasos;
    }

    public void setS2MenorPasos(String s2MenorPasos) {
        this.s2MenorPasos = s2MenorPasos;
    }

    public String getS3TiempoPromedio() {
        return s3TiempoPromedio;
    }

    public void setS3TiempoPromedio(String s3TiempoPromedio) {
        this.s3TiempoPromedio = s3TiempoPromedio;
    }

    public String getS3PromedioPasos() {
        return s3PromedioPasos;
    }

    public void setS3PromedioPasos(String s3PromedioPasos) {
        this.s3PromedioPasos = s3PromedioPasos;
    }

    public String getS3MayorPasos() {
        return s3MayorPasos;
    }

    public void setS3MayorPasos(String s3MayorPasos) {
        this.s3MayorPasos = s3MayorPasos;
    }

    public String getS3MenorPasos() {
        return s3MenorPasos;
    }

    public void setS3MenorPasos(String s3MenorPasos) {
        this.s3MenorPasos = s3MenorPasos;
    }

    public String getS4TiempoPromedio() {
        return s4TiempoPromedio;
    }

    public void setS4TiempoPromedio(String s4TiempoPromedio) {
        this.s4TiempoPromedio = s4TiempoPromedio;
    }

    public String getS4PromedioPasos() {
        return s4PromedioPasos;
    }

    public void setS4PromedioPasos(String s4PromedioPasos) {
        this.s4PromedioPasos = s4PromedioPasos;
    }

    public String getS4MayorPasos() {
        return s4MayorPasos;
    }

    public void setS4MayorPasos(String s4MayorPasos) {
        this.s4MayorPasos = s4MayorPasos;
    }

    public String getS4MenorPasos() {
        return s4MenorPasos;
    }

    public void setS4MenorPasos(String s4MenorPasos) {
        this.s4MenorPasos = s4MenorPasos;
    }
    public static void crearMovilizadorServicios(){
         movilizarServicios= new MovilizadorServicios("","","","","","","","","","","","");
    }
}
