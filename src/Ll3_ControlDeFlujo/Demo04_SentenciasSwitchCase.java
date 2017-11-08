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
public class Demo04_SentenciasSwitchCase {
    public static void main(String[] args) {
        
       /*
        *Crear un programa que dado un numero
        * entre 1 y 7 imprima el dia de la semana
        * por ejemplo, ingreso el numero 3 
        * debe mostrar el dia martes
        * si escribe cualquier otro numero diferente entre 1 y 7 debe 
        * enviar un mensaje al usuario de error, numero incorrecto ingresado
        * debe ingresar un numero entre 1 y 7
        */
       Scanner  T = new Scanner(System.in);
       int dia;
       
        System.out.println("Escribe un numero entre 1 y 7");
        dia= T.nextInt();
       
       switch(dia){
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Lunes");
               break;
           case 3:
               System.out.println("Martes");
               break;
           case 4:
               System.out.println("Miercoles");
               break;
            case 5:
                System.out.println("Jueves");
               break;
           case 6:
               System.out.println("Viernes");
               break;
           case 7:
               System.out.println("Sabado");
               break;   
           default:
               System.err.println("Error,número ingresado incorrecto."
                       + "\n Ingresa un numero entre 1 y 7.");
                       
           
       }
       
       
       
       
        
    }
}
