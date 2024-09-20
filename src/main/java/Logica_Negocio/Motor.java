/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Motor {
    // Atributos
    public String Tamaño;
    public String id_motor;
    public String Posicion;

    //Constructor no parametrizado
    public Motor() {
    }

    //Constructor parametrizado
    public Motor(String Tamaño, String id_motor, String Posicion) {
        this.Tamaño = Tamaño;
        this.id_motor = id_motor;
        this.Posicion = Posicion;
    }
    
    // Setters and Getters

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getId_motor() {
        return id_motor;
    }

    public void setId_motor(String id_motor) {
        this.id_motor = id_motor;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    
    
}
