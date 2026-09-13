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
public class menu {

    public void menu() {
        Nivel1 n1 = new Nivel1();
        Nivel2 n2 = new Nivel2();
        Nivel3 n3 = new Nivel3();
        Nivel4 n4 = new Nivel4();
        Nivel5 n5 = new Nivel5();

        String textoNivel = JOptionPane.showInputDialog("""
                                                        \nNivel basico
                                                        \nPor favor elija un nivel del 1 al 4 para pooder comprobar nuestras funciones""");
        int nivel = Integer.parseInt(textoNivel);

        switch (nivel) {
            case 1:
                String texto1 = JOptionPane.showInputDialog("Elija un algoritmo del 1 al 5");
                int alg1 = Integer.parseInt(texto1);
                switch (alg1) {
                    case 1:
                        n1.Algoritmo1();
                        break;
                    case 2:
                        n1.algoritmo2();
                        break;
                    //agregar Jaz
                
                    default:
                        JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                }

                break;
            case 2:
                String texto2 = JOptionPane.showInputDialog("""
                                                        \nNivel basico-intermedio
                                                        \nPor favor elija un nivel del 5 al 12 para pooder comprobar nuestras funciones""");
                int alg2 = Integer.parseInt(texto2);
                switch (alg2) {
                    case 1:
                        n2.algoritmos5();
                        break;
                    case 2:
                        n2.algoritmos6();
                        break;
                    //agregar Jaz
                    default:
                        JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                }

                break;
            case 3:
                String texto3 = JOptionPane.showInputDialog("""
                                                        \nNivel intermedio
                                                        \nPor favor elija un nivel del 9 al 12 para pooder comprobar nuestras funciones""");
                int alg3 = Integer.parseInt(texto3);
                switch (alg3) {
                    case 1:
                        n3.algoritmos9();
                        break;
                    case 2:
                        n3.algoritmos10();
                        break;
                    //agregar Jaz
                    default:
                        JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                }
                break;
       case 4:
            String texto4 = JOptionPane.showInputDialog("""
                                                        \nNivel intermedio/alto
                                                        \nPor favor elija un nivel del 13 al 16 para pooder comprobar nuestras funciones""");
                int alg4 = Integer.parseInt(texto4);
                switch (alg4) {
                    case 1:
                        n4.algoritmos13();
                        break;
                    case 2:
                        n4.algoritmos14();
                        break;
                    //agregar Jaz
                
                    default:
                        JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
        }
            break;
        case 5:
            String texto5 = JOptionPane.showInputDialog("""
                                                        \nNivel alto
                                                        \nPor favor elija un nivel del 17 al 20 para pooder comprobar nuestras funciones""");
                int alg5 = Integer.parseInt(texto5);
                switch (alg5) {
                    case 1:
                        n5.algoritmos17();
                        break;
                    case 2:
                        n5.algoritmos18();
                        break;
                    //agregar Jaz
                    default:
                        JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
    }
            break;
            default:
            JOptionPane.showMessageDialog(null, "Nivel no valido");
    
        }

    }
}
