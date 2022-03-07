/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1estructura.objeto;

/**
 *
 * @author Mariano
 */
public class Apostador {
    private String nombre;
    private double monto;
    private int primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo;
    private int punteo;

    public Apostador(String nombre, double monto, int primero, int segundo, int tercero, int cuarto, int quinto, int sexto, int septimo, int octavo, int noveno, int decimo, int punteo) {
        this.nombre = nombre;
        this.monto = monto;
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.cuarto = cuarto;
        this.quinto = quinto;
        this.sexto = sexto;
        this.septimo = septimo;
        this.octavo = octavo;
        this.noveno = noveno;
        this.decimo = decimo;
        this.punteo = punteo;
    }
    @Override
    public String toString(){
        return  nombre+", "+monto+", "+primero+", "+segundo+", "+tercero+", "+cuarto+", "+quinto+", "+sexto+", "+septimo+", "+octavo+", "+noveno+", "+decimo;
        
    }
    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getTercero() {
        return tercero;
    }

    public void setTercero(int tercero) {
        this.tercero = tercero;
    }

    public int getCuarto() {
        return cuarto;
    }

    public void setCuarto(int cuarto) {
        this.cuarto = cuarto;
    }

    public int getQuinto() {
        return quinto;
    }

    public void setQuinto(int quinto) {
        this.quinto = quinto;
    }

    public int getSexto() {
        return sexto;
    }

    public void setSexto(int sexto) {
        this.sexto = sexto;
    }

    public int getSeptimo() {
        return septimo;
    }

    public void setSeptimo(int septimo) {
        this.septimo = septimo;
    }

    public int getOctavo() {
        return octavo;
    }

    public void setOctavo(int octavo) {
        this.octavo = octavo;
    }

    public int getNoveno() {
        return noveno;
    }

    public void setNoveno(int noveno) {
        this.noveno = noveno;
    }

    public int getDecimo() {
        return decimo;
    }

    public void setDecimo(int decimo) {
        this.decimo = decimo;
    }
    
    
}
