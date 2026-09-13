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

    //April
    public void algoritmo9() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Mayor: " + mayor + " Menor: " + menor);
    }

    public void algoritmo10() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
        String textoBuscado = JOptionPane.showInputDialog("Que numero desea buscar?");
        int buscado = Integer.parseInt(textoBuscado);

        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                posicion = i;
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Posicion: " + posicion);
    }

    //Jazmin
    //Leer 12 números y solicitar un valor
    public void algoritmo11() {
        int[] numeros = new int[12];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: " + (i + 1)));
        }

        int valorBuscado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor: "));
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                contador++;
            }
        }

        String resultado = "El valor " + valorBuscado + " aparece " + contador + " veces";
        JOptionPane.showMessageDialog(null, resultado);
    }

    //Dado un arreglo de caracteres, contar por separado vocales, consonantes etc.
    public void algoritmo12() {
        String texto = "FUNDAMENTOS";
        int vocales = 0;
        int consonantes = 0;
        int otros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vocales++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                consonantes++;
            } else {
                otros++;
            }
        }

        String resultado = "Texto analizado: " + texto
                + "\nVocales: " + vocales
                + "\nConsonantes: " + consonantes
                + "\nOtros simbolos: " + otros;
        JOptionPane.showMessageDialog(null, resultado);
    }
}