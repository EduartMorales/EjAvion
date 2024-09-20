/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class Avion {
    
    // Aqui se hace la composicion
    public String Nombre;
    public ArrayList<Ala> listaalas;
    public Fuselaje objFuselaje;
    public ArrayList<Llanta> listallantas;
    public ArrayList<Motor> listamotores;
    
    // Constructor no parametrizado

    public Avion() {
    }
    
    // Constructor parametrizado

    public Avion(String Nombre, ArrayList<Ala> listaalas, Fuselaje objFuselaje, ArrayList<Llanta> listallantas, ArrayList<Motor> listamotores) {
        this.Nombre = Nombre;
        this.listaalas = listaalas;
        this.objFuselaje = objFuselaje;
        this.listallantas = listallantas;
        this.listamotores = listamotores;
    }
    // Setters and Getters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Ala> getListaalas() {
        return listaalas;
    }

    public void setListaalas(ArrayList<Ala> listaalas) {
        this.listaalas = listaalas;
    }

    public Fuselaje getObjFuselaje() {
        return objFuselaje;
    }

    public void setObjFuselaje(Fuselaje objFuselaje) {
        this.objFuselaje = objFuselaje;
    }

    public ArrayList<Llanta> getListallantas() {
        return listallantas;
    }

    public void setListallantas(ArrayList<Llanta> listallantas) {
        this.listallantas = listallantas;
    }

    public ArrayList<Motor> getListamotores() {
        return listamotores;
    }

    public void setListamotores(ArrayList<Motor> listamotores) {
        this.listamotores = listamotores;
    }
    
}
