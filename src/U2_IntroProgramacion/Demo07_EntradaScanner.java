/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_IntroProgramacion;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Demo07_EntradaScanner {
    public static void main(String[] args) {
         Scanner Teclado = new Scanner(System.in);
        
        //declarando variables
        int a,b, c;
        
        System.out.println("Ingresa el valor para A: ");
        a  = Teclado.nextInt();
        System.out.println("Ingresa el valor para B: ");
        b  = Teclado.nextInt();
        
        /* Suma de dos variables*/
        c = a+b;
        System.out.println("La suma de "+a+" + "+b+" es igual a "+c);
        
        /* Resta de dos variables*/
        c = a-b;
        System.out.println("La resta de "+a+" - "+b+" es igual a "+c);
        
        /* Suma de dos variables*/
        c = a*b;
        System.out.println("La multiplicación de "+a+" * "+b+" es igual a "+c);
        
        /* Division de dos variables*/
        c = a/b;
        System.out.println("La división de "+a+" / "+b+" es igual a "+c);
        
        /* Modulo de dos variables*/
        c = a%b;
        System.out.println("El modulo de "+a+" % "+b+" es igual a "+c);
        
    }
}
