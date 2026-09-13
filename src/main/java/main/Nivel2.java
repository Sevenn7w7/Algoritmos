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
    
    //Leer 8 números decimales y calcular el promedio general
     public void algoritmo5 (){
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
     
     //Usar un arreglo de 20 valores booleanos
     public void algoritmo6 (){
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
     
     //Dado un arreglo de caracteres, contar cuántas vocales
     public void algoritmo7(){
        String texto = "FUNDAMENTOS";
        int contadorVocales = 0;
        
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                contadorVocales++;
            }
        }
        
        String resultado = "Texto analizado: "+texto+ "\nCantidad de vocales: " + contadorVocales;
        JOptionPane.showMessageDialog(null, resultado);
    }
       
    //Leer 15 números. Mostrar la suma de los elementos 
    public void algoritmo8(){
        int[] numeros = new int[15];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        
        for(int i= 0; i < numeros.length; i++){
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: " + (i + 1)));
        
        if (i % 2 == 0){
            sumaPares += numeros[i];
        }else{
            sumaImpares += numeros[i];
        }
            
        }
        
        String resultado = "Suma en indices pares: " + sumaPares
                        + "\nSuma en indices impares: " + sumaImpares;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}

