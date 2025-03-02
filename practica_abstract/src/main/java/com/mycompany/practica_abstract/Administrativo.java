/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_abstract;

/**
 *
 * @author Admin
 */
public class Administrativo {
    
  protected String horario;
  protected String salario;

    public Administrativo(String pHorario, String pSalario, int pCedula, String pNombre, String pApellidos, String pFec_nac, int pGen) {
        this.horario = pHorario;
        this.salario = pSalario;
    }
  
    
   
    public void viajar(){
       
    }
    
    public void dormir(){
        
    }
    
     public void comer(){
        System.out.println("Podre comer");
        
    }
    
  
     
}
