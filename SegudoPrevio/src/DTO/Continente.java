/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author kevin
 */
public class Continente {
    
    private int idcontinente;
    private String nombre;

    public Continente() {
    }

    public Continente(int idcontinente, String nombre) {
        this.idcontinente = idcontinente;
        this.nombre = nombre;
    }

    public int getIdcontinente() {
        return idcontinente;
    }

    public void setIdcontinente(int idcontinente) {
        this.idcontinente = idcontinente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
