/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Fuselaje {
    // Atributos
    public String Nombre;
    
    //Constructor no prametrizado

    public Fuselaje() {
    }
    // Constructor parametrizado

    public Fuselaje(String Nombre) {
        this.Nombre = Nombre;
    }
    // Setters and Getters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
