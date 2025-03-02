/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_abstract;

/**
 *
 * @author Admin
 */
public class Academico {
    
    protected String titulacion;
    protected String salario;
    protected String experiencia;

    public Academico(String pTitulacion, String pSalario, String pExperiencia, int pCedula, String pNombre, String pApellidos, String pFec_nac, int pGen) {
        this.titulacion = pTitulacion;
        this.salario = pSalario;
        this.experiencia = pExperiencia;
    }
    
     public void viajar(){
        
    }
     
      public void dormir(){
        
        
    }
    public void comer(){
        
        System.out.println("Voy a comer");
    }
    
   
    
   
    
    
    
}
