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
public class MovilizadorDatos {
    //creamos variables
    private String directorio;
    private boolean entrarVerResultados;
    private boolean entrarVerificacion;
    private boolean apuestaYaCerrada;
    private int contadorApuestaRechazada;
    private int contadorResultadosObtenidos;
    private boolean verAnimacion;
    public static MovilizadorDatos movilizar;
    //constructor para movilizarme mis datos entre clases

    public MovilizadorDatos(String directorio, boolean entrarVerResultados, boolean entrarVerificacion, boolean apuestaYaCerrada, int contadorApuestaRechazada, int contadorResultadosObtenidos, boolean verAnimacion) {
        this.directorio = directorio;
        this.entrarVerResultados = entrarVerResultados;
        this.entrarVerificacion = entrarVerificacion;
        this.apuestaYaCerrada = apuestaYaCerrada;
        this.contadorApuestaRechazada = contadorApuestaRechazada;
        this.contadorResultadosObtenidos = contadorResultadosObtenidos;
        this.verAnimacion = verAnimacion;
    }

    public boolean isVerAnimacion() {
        return verAnimacion;
    }

    public void setVerAnimacion(boolean verAnimacion) {
        this.verAnimacion = verAnimacion;
    }

    public boolean isEntrarVerificacion() {
        return entrarVerificacion;
    }

    public void setEntrarVerificacion(boolean entrarVerificacion) {
        this.entrarVerificacion = entrarVerificacion;
    }

    public boolean isApuestaYaCerrada() {
        return apuestaYaCerrada;
    }

    public void setApuestaYaCerrada(boolean apuestaYaCerrada) {
        this.apuestaYaCerrada = apuestaYaCerrada;
    }

    

    public boolean isEntrarVerResultados() {
        return entrarVerResultados;
    }

    public void setEntrarVerResultados(boolean entrarVerResultados) {
        this.entrarVerResultados = entrarVerResultados;
    }

    

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public int getContadorApuestaRechazada() {
        return contadorApuestaRechazada;
    }

    public void setContadorApuestaRechazada(int contadorApuestaRechazada) {
        this.contadorApuestaRechazada = contadorApuestaRechazada;
    }

    public int getContadorResultadosObtenidos() {
        return contadorResultadosObtenidos;
    }

    public void setContadorResultadosObtenidos(int contadorResultadosObtenidos) {
        this.contadorResultadosObtenidos = contadorResultadosObtenidos;
    }
    
    //estructuramos creador de un valor MovilizadorDatos inicializandolo
    public static void crearMovilizador(){
         movilizar= new MovilizadorDatos("",false,false,false,1,1,true);
    }
}
