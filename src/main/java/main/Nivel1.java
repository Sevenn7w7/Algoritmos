/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author April
 */
public class Nivel1 {
    public void Algoritmo1(){
        double[] numeros = {11.2, 3.1, 27.84, 39.56};
        System.out.println("Longitud del arreglo  :" +numeros.length);
        System.out.println("Ultimo elemento :" +numeros[numeros.length -1]);
    }

    public void algoritmo2(){
        boolean[] valores = {true, false, true, true, false, true};
        for (int i=0; i < valores.length ;i++)
            System.out.println(" [" + i + "]: " + valores[i]);
    }
}
