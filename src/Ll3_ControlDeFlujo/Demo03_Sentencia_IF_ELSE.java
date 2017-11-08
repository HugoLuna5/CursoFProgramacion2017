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
public class Demo03_Sentencia_IF_ELSE {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre ");
         nombre = entrada.nextLine();
        
        if(nombre.equalsIgnoreCase("Hugo")){
            System.out.println("Hola "+nombre.toUpperCase());
        }else{
        
           System.err.println("Nombre incorrecto,"
                   + "\nAprende a escribir tu nombre. \n"
                   + "Regresa al preescolar");
        }
    }
    
}
