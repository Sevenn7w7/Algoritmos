/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

<<<<<<< HEAD
import javax.swing.JOptionPane;

=======
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
/**
 *
 * @author April
 */
public class Nivel1 {
<<<<<<< HEAD
    
    
    //Crear un arreglo de 4 números decimales
    public void algoritmo1(){
=======
    public void Algoritmo1(){
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
        double[] numeros = {11.2, 3.1, 27.84, 39.56};
        System.out.println("Longitud del arreglo  :" +numeros.length);
        System.out.println("Ultimo elemento :" +numeros[numeros.length -1]);
    }

<<<<<<< HEAD
    //Crear un arreglo de 6 valores booleanos
=======
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
    public void algoritmo2(){
        boolean[] valores = {true, false, true, true, false, true};
        for (int i=0; i < valores.length ;i++)
            System.out.println(" [" + i + "]: " + valores[i]);
    }
<<<<<<< HEAD
    
    
    //Leer 8 numeros enteros
    public void algoritmo3(){
        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: " + (i + 1)));            
        }
        
        String resultado = "Valores ingresados:\n";
        for (int i = 0; i < numeros.length; i++){
            resultado += numeros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    //convertir una palabra a un arreglo de caracteres
    public void algoritmo4(){
        String palabra = "FUNDAMENTOS";
        String resultado = "";
        
        for (int i = 0; i < palabra.length(); i++){
            resultado += "Caracter:" + i  + palabra.charAt(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
=======
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
}
