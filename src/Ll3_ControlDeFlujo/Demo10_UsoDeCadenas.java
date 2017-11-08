/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ll3_ControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Demo10_UsoDeCadenas {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Escribe una palabra");
        String palabra = entrada.nextLine();
        
        System.out.println("Primera letra "+palabra.substring(0,1));
        
        //System.out.println("Longitud de la palabra "+palabra+" : "+palabra.);
    
        System.out.println("Letra: "+palabra.charAt(2));
        
        char c[] = palabra.toCharArray();
        System.out.println("Longitud del arreglo de caracteres: "+c.length);
    }
}
