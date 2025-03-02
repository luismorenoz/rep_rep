/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_abstract;

/**
 *
 * @author Admin
 */
public class Persona {
    
      protected int cedula;
    protected String nombre;
    protected String apellidos;
    protected String fec_nac;
    protected int gen; // genero

    public Persona(int pCedula, String pNombre, String pApellidos, String pFec_nac, int pGen) {
        this.cedula = pCedula;
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.fec_nac = pFec_nac;
        this.gen = pGen;
        
    }
    
        public void comer(){
        
            System.out.println("Comer");
        
        
    }
    public void dormir(){}
    
    public void viajar(){}
    
    }
