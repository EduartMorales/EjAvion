/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Llanta {
    // Atributos
    public String Tamaño;
    public String Marca;
    // Constructor no parametrizado

    public Llanta() {
    }
    // Constructor parametrizado
    public Llanta(String Tamaño, String Marca) {
        this.Tamaño = Tamaño;
        this.Marca = Marca;
    }
    // Setters and Getters

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
}
