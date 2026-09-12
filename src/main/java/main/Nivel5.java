/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author April
 */
public class Nivel5 {
    public void algoritmos17(){
        int[] arreglo1 = new int [5];
        int[] arreglo2 = new int [5];
        int[] suma = new int [5];
        for (int i = 0; i < arreglo1.length; i++){
         String texto = JOptionPane.showInputDialog("arreglo 1. numero " +(i+1)+ ":");
  arreglo1[i] =  Integer.parseInt(texto);
    
    }
        for (int i = 0; i < arreglo2.length; i++){
         String texto = JOptionPane.showInputDialog("arreglo 1. numero " +(i+1)+ ":");
  arreglo2[i] =  Integer.parseInt(texto);
        }
        for (int i = 0; i < suma.length; i++){
         String texto = JOptionPane.showInputDialog("arreglo 1. numero " +(i+1)+ ":");
  suma[i] =  arreglo1[i] + arreglo2[i];
        }
        String resultado = "";
        for (int i = 0; i < suma.length; i++){
            resultado = resultado + suma[i] + "";
        }
        JOptionPane.showMessageDialog(null, "Arreglo suma: " +resultado);
    }
    
    //18
    public void algoritmos18 (){
          double[] precios1 = new double[5];
       double[] precios2 = new double[5];
       double[] diferencias = new double[5];
       
        for (int i = 0; i < precios1.length; i++){
         String texto = JOptionPane.showInputDialog("Precios 1. numero " +(i+1)+ ":");
  precios1[i] =  Integer.parseInt(texto);
    
    }
        for (int i = 0; i < precios2.length; i++){
         String texto = JOptionPane.showInputDialog("arreglo 2. numero " +(i+1)+ ":");
  precios2[i] =  Integer.parseInt(texto);
        }
        double sumaDiferencia = 0;
        for (int i = 0; i < diferencias.length; i++){
         if (precios1[i]>=precios2[i]){
         diferencias[i] = precios1[1] - precios2[i];
         }else{
         diferencias[i] = precios2[1] - precios1[i];
         }
         sumaDiferencia = sumaDiferencia = diferencias[i];
        }
        
    }
}
