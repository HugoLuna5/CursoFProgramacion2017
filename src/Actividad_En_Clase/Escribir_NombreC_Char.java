/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_En_Clase;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Escribir_NombreC_Char {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String inicial = "H";
        System.out.println("ingrese su inicial");
        inicial = entrada.nextLine();
       
         if(inicial.contains("H") || inicial.contains("h")){
          System.out.println("Ingrese su nombre ");
             nombre = entrada.nextLine();         
        if(nombre.equalsIgnoreCase("Hugo Dario Luna Cruz")){
            System.out.println("Hola "+nombre);
        }else{
        
           System.err.println("Nombre incorrecto");
        }
       }else{
             System.out.println("Inicial incorrecta");
         }
        
    }
}
