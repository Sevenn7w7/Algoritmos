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

    public void menu() {
        Nivel1 n1 = new Nivel1();
        Nivel2 n2 = new Nivel2();
        Nivel3 n3 = new Nivel3();
        Nivel4 n4 = new Nivel4();
        Nivel5 n5 = new Nivel5();

        int opcion;
        do {
            String menu = "--- Arreglos Unidimensionales---\n"
                    + "1. Nivel 1 -Fundamentos\n"
                    + "2. Nivel 2 -Recorridos y acumulación\n"
                    + "3. Nivel 3 -Busqueda, extremos y condiciones\n"
                    + "4. Nivel 4 -Transformacio de arreglos\n"
                    + "5. Nivel 5 -Integracion y retos\n"
                    + "0. Salir";

            String entrada = JOptionPane.showInputDialog(null, menu);

            if (entrada == null) {
                opcion = 0;
            } else {
                opcion = Integer.parseInt(entrada);
            }

            switch (opcion) {
                case 1:
                    String subMenu1 = "--- Nivel 1: Basico del 1-4 ---\n"
                            + "1. Crea un arreglo de 4 números decimales y muestra su longitud y último elemento.\n"
                            + "2. Crea un arreglo de 6 booleanos y muestra el valor de cada posición.\n"
                            + "3. Pide 8 números enteros y los muestra uno por línea.\n"
                            + "4. Convierte una palabra en un arreglo de caracteres y muestra cada letra por separado.\n";
                    String entradaSub1 = JOptionPane.showInputDialog(null, subMenu1);
                    int opcionSub1 = Integer.parseInt(entradaSub1);
                    switch (opcionSub1) {
                        case 1:
                            n1.Algoritmo1();
                            break;
                        case 2:
                            n1.algoritmo2();
                            break;
                        //agregar Jaz
                        case 3:
                            n1.algoritmo3();
                            break;
                        case 4:
                            n1.algoritmo4();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                    }

                    break;
                case 2:
                    String subMenu2 = "--- Nivel 2: Basico-Intermedio del 5-8 ---\n"
                            + "5. Pide 8 números decimales y calcula el promedio general\n"
                            + "6. Registra asistencia de 20 estudiantes y calcula cuántos asistieron, faltaron y el porcentaje.\n"
                            + "7. Pide una palabra y cuenta cuántas vocales contiene.\n"
                            + "8. Pide 15 números y suma por separado los que están en posiciones pares e impares.";
                    String entradaSub2 = JOptionPane.showInputDialog(null, subMenu2);
                    int opcionSub2 = Integer.parseInt(entradaSub2);
                    switch (opcionSub2) {
                        case 5:
                            n2.algoritmo5();
                            break;
                        case 6:
                            n2.algoritmo6();
                            break;
                        //agregar Jaz
                        case 7:
                            n2.algoritmo7();
                            break;
                        case 8:
                            n2.algoritmo8();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                    }

                    break;
                case 3:
                    String subMenu3 = "--- Nivel 3: Intermedio del 9-12 ---\n"
                            + "9. Pide 10 números enteros y determina el mayor y el menor.\n"
                            + "10. Pide un arreglo y un número a buscar; muestra la posición donde aparece o -1 si no existe.\n"
                            + "12. Pide 12 números y un valor; cuenta cuántas veces aparece ese valor.\n"
                            + "13. Pide una palabra y cuenta vocales, consonantes y otros símbolos por separado.";
                    String entradaSub3 = JOptionPane.showInputDialog(null, subMenu3);
                    int opcionSub3 = Integer.parseInt(entradaSub3);
                    switch (opcionSub3) {
                        case 9:
                            n3.algoritmo9();
                            break;
                        case 10:
                            n3.algoritmo10();
                            break;
                        //agregar Jaz
                        case 11:
                            n3.algoritmo11();
                            break;
                        case 12:
                            n3.algoritmo12();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                    }

                    break;
                case 4:
                    String subMenu4 = "--- Nivel 4: Intermedio-Alto del 13-16 ---\n"
                            + "13. \"Invierte un arreglo de 10 números intercambiando los extremos.\n"
                            + "14. Crea una copia independiente de un arreglo y demuestra que modificar la copia no afecta al original.\n"
                            + "15. Rota un arreglo una posición a la derecha (el último pasa a ser el primero).\n"
                            + "16. Pide dos posiciones válidas del arreglo e intercambia los valores entre ellas.\"";
                    String entradaSub4 = JOptionPane.showInputDialog(null, subMenu4);
                    int opcionSub4 = Integer.parseInt(entradaSub4);
                    switch (opcionSub4) {
                        case 13:
                            n4.algoritmo13();
                            break;
                        case 14:
                            n4.algoritmo14();
                            break;
                        //agregar Jaz
                        case 15:
                            n4.algoritmo15();
                            break;
                        case 16:
                            n4.algoritmo16();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                    }

                    break;

                case 5:
                    String subMenu5 = "--- Nivel 5: Alto del 17-20 ---\n"
                            + "17. Crea dos arreglos y genera un tercero con la suma de posiciones correspondientes.\n"
                            + "18. Crea dos arreglos de precios y calcula el promedio de las diferencias absolutas entre ellos.\n"
                            + "19. Pide un arreglo y determina si está ordenado de menor a mayor.\n"
                            + "20. Determina si un arreglo es capicúa (se lee igual al derecho y al revés).\n";
                    String entradaSub5 = JOptionPane.showInputDialog(null, subMenu5);
                    int opcionSub5 = Integer.parseInt(entradaSub5);
                    switch (opcionSub5) {
                        case 17:
                            n5.algoritmo17();
                            break;
                        case 18:
                            n5.algoritmo18();
                            break;
                        //agregar Jaz
                        case 19:
                            n5.algoritmo19();
                            break;
                        case 20:
                            n5.algoritmo20();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eleccion fuera de los parametros");
                    }

                    break;

            }
        } while(opcion !=0);
    }
}

