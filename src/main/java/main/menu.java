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
public class menu {
    
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
