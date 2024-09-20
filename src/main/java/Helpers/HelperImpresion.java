/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Avion;

/**
 *
 * @author 1061688186
 */
public class HelperImpresion {
    public static void ImprimirAvion(Avion objAvion) {
        System.out.println("La marca del avion es"+"\t"+objAvion.getNombre());
        System.out.println("El fuselaje del avion es"+"\t"+objAvion.getObjFuselaje().getNombre());
        
        for (int i = 0; i < objAvion.getListaalas().size(); i++) {
            System.out.println("La posicion del ala es:"+"\t"+objAvion.getListaalas().get(i).getPosicion());
            System.out.println("El tamaño del ala es:"+"\t"+objAvion.getListaalas().get(i).getTamaño());
        }
        
        for (int i = 0; i < objAvion.getListallantas().size(); i++) {
            System.out.println("El tamaño de la llanta es:"+"\t"+objAvion.getListallantas().get(i).getTamaño());
            System.out.println("La marca de la llanta es:"+"\t"+objAvion.getListallantas().get(i).getMarca());
        }
        
        for (int i = 0; i < objAvion.getListamotores().size(); i++) {
            System.out.println("El tamaño del motor es"+"\t"+objAvion.getListamotores().get(i).getTamaño());
            System.out.println("El id del motor es"+"\t"+objAvion.getListamotores().get(i).getId_motor());
            System.out.println("La posicion del motor es"+"\t"+objAvion.getListamotores().get(i).getPosicion());
        }   
    }
}
