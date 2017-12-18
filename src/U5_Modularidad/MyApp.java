/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U5_Modularidad;

import search.Secuencial;
import sort.Burbuja;

/**
 *
 * @author HugoLuna
 */
public class MyApp {

    public static void main(String[] args) {
        int vector[] = {10, 5, 90, 30};

        Burbuja objBurbuja = new Burbuja();
        Secuencial objSecuencial = new Secuencial();

        objBurbuja.imprimirVector(vector);
        objBurbuja.ordenarConBurbuja(vector);
        objBurbuja.imprimirVector(vector);

        System.out.println("Secuencial");

        System.out.println(objSecuencial.buscarElemento(vector, 1));

    }
}
