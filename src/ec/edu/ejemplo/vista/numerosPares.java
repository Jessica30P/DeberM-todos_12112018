/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ejemplo.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Flores
 */

 public class numerosPares {
 public static void main(String[] args) {
 int numero=1;
 int limite=100;
 while(numero <= 20){
  if(numero%2==0){
   //System.out.println(numero);
   JOptionPane.showMessageDialog(null, numero); 
  }
  numero++;
  
 }
    
}

 
}


