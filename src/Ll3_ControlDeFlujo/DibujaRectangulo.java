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
public class DibujaRectangulo {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        
        int alto,ancho,i,j;
        
        System.out.println("Ingrese el alto del rectangulo: ");
        alto = T.nextInt();
        
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = T.nextInt();
        
        
        for(i = 1; i<=alto; i++){
            
            for(j =0; j<ancho; j++){
                System.out.print("* ");
            }
                System.out.println("");
        }
    }
}
