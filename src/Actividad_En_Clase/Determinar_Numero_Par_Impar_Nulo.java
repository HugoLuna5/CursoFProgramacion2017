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
public class Determinar_Numero_Par_Impar_Nulo {
      // TODO code application logic here
        public static void main(String[] args) {
        
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
            
    }
}
