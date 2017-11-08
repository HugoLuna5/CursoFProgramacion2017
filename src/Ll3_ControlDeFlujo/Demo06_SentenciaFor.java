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
public class Demo06_SentenciaFor {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        
        int n,i,j;
        
        System.out.println("Ingrese el valor de n: ");
        n = T.nextInt();
        
        
        for(i = 1; i<=n; i++){
            
            for(j =0; j<n; j++){
                System.out.print("* ");
            }
                System.out.println("");
        }
    }
}
