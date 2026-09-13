/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

<<<<<<< HEAD

=======
import java.util.Scanner;
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
import javax.swing.JOptionPane;

/**
 *
 * @author April
 */
public class menu {
<<<<<<< HEAD
    
    public void mostrarMenuPrincipal(){
        int opcion;
        
        Nivel1 nivel1 = new Nivel1();
        Nivel2 nivel2 = new Nivel2();
        Nivel3 nivel3 = new Nivel3();
        Nivel4 nivel4 = new Nivel4();
        Nivel5 nivel5= new Nivel5();
        
        
        do{
            String menu = "--- Arreglos Unidimensionales---\n"
                    +"1. Nivel 1 -Fundamentos\n"
                    +"2. Nivel 2 -Recorridos y acumulación\n"
                    +"3. Nivel 3 -Busqueda, extremos y condiciones\n"
                    +"4. Nivel 4 -Transformacio de arreglos\n"
                    +"5. Nivel 5 -Integracion y retos\n"
                    +"0. Salir";
            
            String entrada = JOptionPane.showInputDialog(null, menu);
            
            if (entrada == null){
                opcion = 0;
            }else{
                opcion = Integer.parseInt(entrada);
            }
            
            switch(opcion){
                case 1:
                    nivel1.algoritmo1();
                    nivel1.algoritmo2();
                    nivel1.algoritmo3();
                    nivel1.algoritmo4();
                    
                    break;
                case 2:
                    nivel2.algoritmo5();
                    nivel2.algoritmo6();
                    nivel2.algoritmo7();
                    nivel2.algoritmo8();
                    break;
                case 3:
                    nivel3.algoritmo9();
                    nivel3.algoritmo10();
                    nivel3.algoritmo11();
                    nivel3.algoritmo12();
                    break;
                case 4:
                    nivel4.algoritmo13();
                    nivel4.algoritmo14();
                    nivel4.algoritmo15();
                    nivel4.algoritmo16();
                    break;
                case 5:
                    nivel5.algoritmo17();
                    nivel5.algoritmo18();
                    nivel5.algoritmo19();
                    nivel5.algoritmo20();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inválida");
            }
                    
        }while (opcion != 0);
    }
    
}  
=======

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
>>>>>>> 81289504108e106e9294b3ad28b74d2b4805d235
