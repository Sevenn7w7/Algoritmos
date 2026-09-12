/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author April
 */
public class Nivel2 {
     public void algoritmos5 (){
    double[] numeros = new double[8];
   
    for(int i=0; i < numeros.length; i++){
     String texto = JOptionPane.showInputDialog("Ingrese un numero decimal " +(i+1)+ ": ");
   numeros[i]= Double.parseDouble(texto);
}
    double suma = 0;
    for (int i = 0; i < numeros.length; i++ ){
        suma=suma + numeros[i];
    }
    double promedio = suma / numeros.length;
    System.out.println("El promedio es: "+String.format("%.2f", promedio));
}
     public void algoritmos6 (){
     boolean [] asistencia = new boolean [20];
     
     for (int i = 0; i < asistencia.length; i++){
          String texto = JOptionPane.showInputDialog("Asistio " + (i+ 1)+ "? (true/ false): ");
          asistencia[i]= Boolean.parseBoolean(texto);
     }
     int asistieron = 0;
             for (int i = 0; i < asistencia.length ; i++){
     if (asistencia[i] == true){
         asistieron = asistieron + 1;
     }
     }
             int faltaron = asistencia.length - asistieron;
             double porcentaje = (asistieron * 100.0) / asistencia.length;
                     System.out.println("Asistieron: " + asistieron);
                      System.out.println("faltaron: " + faltaron);
                       System.out.println("Porcentaje de asistencia: " + String.format("%.2f", porcentaje) + "%");
                      
     }
}

