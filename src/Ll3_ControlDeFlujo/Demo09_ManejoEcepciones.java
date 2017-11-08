/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ll3_ControlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Demo09_ManejoEcepciones {
    public static void main(String[] args) {
        
        
        try{
            
             Scanner T = new Scanner(System.in);
        int A;
     
        System.out.println("Escribe un número: ");
        A = T.nextInt();
        
        if(A % 2 == 0 && A != 0){
            System.out.println(A+" es par");
        }else if(A == 0){
        System.out.println(A+" es nulo");
        }
        
        else{
            System.out.println(A+" es impar");

        }
            
            
        }catch(InputMismatchException ioe){
            
            System.err.println("Error, debe ingresar un numero correcto");

            /*ioe.printStackTrace();*/
        }
    }
}
