/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_abstract;

/**
 *
 * @author Admin
 */
public class Estudiante extends Persona {
    
    protected String carrera;
    protected String beca;
    protected float notas;

    public Estudiante(String pCarrera, String pBeca, int pNotas, int pCedula, String pNombre, String pApellidos, String pFec_nac, int pGen) {
        super(pCedula, pNombre, pApellidos, pFec_nac, pGen);
        this.carrera = pCarrera;
        this.beca = pBeca;
        this.notas = pNotas;
    }
    
   @Override
   
   public void dormir(){
       System.out.println("Dejare dormir a los estudiantes (Clase Academico)");
       
   }
    
    @Override
    
    public void viajar(){
        
        System.out.println("Viajare a la universidad en bus");
        
        
    }
    
    
    
}
