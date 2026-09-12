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
public class Nivel4 {
    public void algoritmos13(){  
    int[] numeros = new int [10];
    for (int i = 0; i < numeros.length; i++){
    String texto = JOptionPane.showInputDialog("ingrese el numero " +(i+1)+ ":");
      numeros[i] =  Integer.parseInt(texto);
    }
        for (int i = 0; i < numeros.length /2; i++ ){
            int a = numeros.length -1 -i;
            int temp = numeros[i];
            numeros [i]= numeros [a];
            numeros [a]= temp;
        }
        String resultado = "";
        for (int i = 0; i < numeros.length; i++){
            resultado = resultado + numeros [i]+ "";
    }
    JOptionPane.showMessageDialog(null, "Arreglo invertido: " +resultado);
            }
    public void algoritmos14(){  
        int[] original = new int [10];
    for (int i = 0; i < original.length; i++){
    String texto = JOptionPane.showInputDialog("ingrese el numero " +(i+1)+ ":");
    original[i] = Integer.parseInt(texto);
    }
    int[] copia = new int [10];
    for (int i = 0; i < original.length; i++){
        copia[i] = original[i];
    }
    
    copia[0] = copia[0] + 100;
     JOptionPane.showMessageDialog(null, "original[0]: " +original[0]+ "\ncopia[0] " +copia[0]);
}
}

    
