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
<<<<<<< HEAD
    
    //Crear dos arreglos de igual tamaño
    public void algoritmo17(){
=======
    public void algoritmos17(){
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
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
    
<<<<<<< HEAD
    //Crear dos arreglos de precios de igual tamaño. Construir un tercero con la diferencia 
    public void algoritmo18 (){
=======
    //18
    public void algoritmos18 (){
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
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
<<<<<<< HEAD
    
    //Leer un arreglo y determinar si está ordenado de forma ascendente
    public void algoritmo19(){
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del arreglo: "));
        int[] numeros = new int[tamano];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: " + (i + 1) ));
        }
        
        boolean ordenado = true;
        for(int i = 0; i < numeros.length -1; i++){
            if (numeros [i] > numeros[i+ 1]){
                ordenado = false;
                break;
            }
            
        }
        
        String textoArreglo = "";
        for(int i = 0; i < numeros.length; i++){
            textoArreglo += numeros[i] + " ";
        }
        
        String mensaje = "";
        if (ordenado){
            mensaje = "El arreglo esta ordenado de forma ascendente";
        }else{
            mensaje = "El arreglo no esta ordenado";
        }
        
        String resultado = "Arreglo ingresado: " + textoArreglo + "\n" + mensaje;
        JOptionPane.showMessageDialog(null,resultado);
    }
    
    //Determinar si un arreglo es capicúa:
    public void algoritmo20(){
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamano del arreglo"));
        int [] numeros = new int [tamano];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numnero: " + (i + 1)));
        }
        
        boolean esCapicua = true;
        int inicio = 0;
        int fin = numeros.length -1;
        while (inicio < fin){
            if(numeros[inicio] != numeros[fin]){
                esCapicua = false;
                break;
            }
            inicio++;
            fin--;
        }
        
        String textoArreglo = "";
        for(int i = 0; i < numeros.length; i++){
            textoArreglo += numeros[i] + " ";
        }
        
        String mensajeCapicua = "";
        if(esCapicua){
            mensajeCapicua = "El arreglo es capicua";
           
        }else{
            mensajeCapicua = "El arreglo no es capicua";
        }
        
        String resultado = "Arreglo ingresado: " + textoArreglo + "\n" + mensajeCapicua;
        JOptionPane.showMessageDialog(null, resultado);
        
    }
=======
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
}
