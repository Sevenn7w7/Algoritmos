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
public class Nivel3 {
    public void algoritmos9 (){
        int[] numeros =new int [10];
      for (int i = 0; i < numeros.length; i++ ){
          String texto = JOptionPane.showInputDialog ("Ingrese el numero " +(i+1)+ ":");
          numeros[i] =  Integer.parseInt(texto);
      }
    int mayor= numeros [0];
    int menor= numeros [0];

    for (int i = 0; i < numeros.length; i++ ){
        if (numeros[i]> mayor){
    mayor = numeros [i];
        }

    if (numeros[i] < menor){
     menor = numeros [i];
}
}
    JOptionPane.showMessageDialog(null, "Mayor: " +mayor+ "Menor: " +menor);
    }
    public void algoritmos10 (){
          int[] numeros =new int [10];
          for(int i =0; i < numeros.length; i++){
          String texto = JOptionPane.showInputDialog("ingrese el numero " +(i+1)+ ":");
                  numeros[i]=Integer.parseInt(texto);
          }
          String textoBuscado = JOptionPane.showInputDialog("Que numero desea buscar?");
                  int buscado = Integer.parseInt(textoBuscado);
                  
          int posicion = -1;
          for (int i=0; i < numeros.length; i++){
          if(numeros[i] == buscado){
          posicion = i;
          break;
          }
              }
  JOptionPane.showMessageDialog(null, "Posicion: " +posicion);
}
}