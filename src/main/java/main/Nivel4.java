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
    //April
    public void algoritmo13() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
        for (int i = 0; i < numeros.length / 2; i++) {
            int a = numeros.length - 1 - i;
            int temp = numeros[i];
            numeros[i] = numeros[a];
            numeros[a] = temp;
        }
        String resultado = "";
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i] + "";
        }
        JOptionPane.showMessageDialog(null, "Arreglo invertido: " + resultado);
    }

    public void algoritmo14() {
        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            String texto = JOptionPane.showInputDialog("ingrese el numero " + (i + 1) + ":");
            original[i] = Integer.parseInt(texto);
        }
        int[] copia = new int[10];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        copia[0] = copia[0] + 100;
        JOptionPane.showMessageDialog(null, "original[0]: " + original[0] + "\ncopia[0] " + copia[0]);
    }

    //Jazmin
    //Rotar un arreglo una posición hacia la derecha
    public void algoritmo15() {
        int[] numeros = {10, 20, 30, 40, 50};

        String original = "";
        for (int i = 0; i < numeros.length; i++) {
            original += numeros[i] + "";
        }

        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        String rotado = "";
        for (int i = 0; i < numeros.length; i++) {
            rotado += numeros[i] + "";
        }

        String resultado = "Arreglo original: " + original + "\nArreglo rotado:" + rotado;
        JOptionPane.showMessageDialog(null, resultado);
    }

    //Solicitar dos índices válidos e intercambiar los valores
    public void algoritmo16() {
        int[] numeros = {5, 10, 20, 30, 40, 50, 60};

        String original = "";
        for (int i = 0; i < numeros.length; i++) {
            original += numeros[i] + "";
        }

        int indice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer indice: ") + (numeros.length - 1));
        int indice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer indice: ") + (numeros.length - 1));

        if (indice1 >= 0 && indice1 < numeros.length && indice2 >= 0 && indice2 < numeros.length) {
            int temp = numeros[indice1];
            numeros[indice1] = numeros[indice2];
            numeros[indice2] = temp;

        }

        String modificado = " ";
        for (int i = 0; i < numeros.length; i++) {
            modificado += numeros[i] + " ";
        }

        String resultado = "Arreglo original: " + original + "\nArreglo despues: " + modificado;
        JOptionPane.showMessageDialog(null, resultado);

    }
}
