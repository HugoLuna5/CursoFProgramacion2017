/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U4_Arreglos;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Demo01_Arreglos1D {
    
    /*
    El sector  de salud requiere de un programa que le permita 
    obtener el promedo del peso de la población que tiene 
    registrada, así también requiere del minimo y máximo peso,
    ordenar de manor a mayor, ordenar de mayor a menor, buscar
    un peso especifico en un momento dado. El programa debe contar
    con un menu para elegir la opción a que desea realizar.
    
    
    El menu de opciones que el cliente del sector de salud espera es el siguiente.
    
        -- Analisis de pesos del SSA --
          ### Menu de opciones ###
    
            1)
            2)
            3)
            4)  
            5)
            6)
            7)
            8)  
            9)
           10)
    
    
    
    */
    
    public static void main(String[] args) {
        
        // ****** Crear arreglos en dos pasos *****
        //Declara arreglo 1D
        int a[];
        //Crear arreglo 1D
        a = new int[4];
        
        // ***** Crear arreglos en un solo paso *****
        int b[] = new int[4];
        
        // Cuando ya se conocen los datos que va a contener el arreglo
        
        String diaSemana[] = {
        "LUN", "MAR", ",MIE", "JUE", "VIE", "SAB", "DOM" };
        
        int edades[] = {22,15,30,60,19,21};
        
        boolean aprobado[] = {true, false,true,true,true};
       
        
        // =========================================  //
        // Crear el arreglo en tiempo de ejecución
        // ========================================== //
        
         Scanner T = new Scanner(System.in);
         
         System.out.println("== Registro de edades de las Mascotas");
         System.out.println("Cantidad de mascotas:  ");
         int nMascotas = T.nextInt();
         // Crear el arreglo 1D
         int edadMascota[] = new int[nMascotas];
         
         //Reistrar la edades de las mascotas
         for (int i =0; i < edadMascota.length; i++){
             System.out.println("Escriba la edad "+(i+1)+ ": ");
             edadMascota[i] = T.nextInt();
             
         }
         
         for(int x = 0; x<edadMascota.length; x++){
             System.out.println("Edad de la mascosta "+(x+1)+": "+edadMascota[x]);
         
         }
         
         System.out.println("");
         
         float promedio = 0;
         float suma =0;
         
         for(int i =0; i<edadMascota.length;i++){
            suma = suma  + edadMascota[i]; 
             
         }
         promedio = suma / nMascotas;
         
         System.out.println("\nEl promedio de edad de mascotas es: "+promedio);
         
        
        
    }
}
