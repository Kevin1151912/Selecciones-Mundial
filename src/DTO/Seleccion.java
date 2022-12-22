/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Seleccion {
    
    private int idSeleccion;
    private String nombre;
    private Continente idContinente;
    private String tecnico;
    private int golesFavor;
    private int golesContra;
    private int partGanados;
    private int partPerdidos;
    private int partjugados;

    public Seleccion() {
        
    }

    public Seleccion(int idSeleccion, String nombre, Continente idContinente, String tecnico, int golesFavor, int golesContra, int partGanados, int partPerdidos, int partjugados) {
        this.idSeleccion = idSeleccion;
        this.nombre = nombre;
        this.idContinente = idContinente;
        this.tecnico = tecnico;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.partGanados = partGanados;
        this.partPerdidos = partPerdidos;
        this.partjugados = partjugados;
    }

    public int getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(int idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(Continente idContinente) {
        this.idContinente = idContinente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getPartjugados() {
        return partjugados;
    }

    public void setPartjugados(int partjugados) {
        this.partjugados = partjugados;
    }
    
}
