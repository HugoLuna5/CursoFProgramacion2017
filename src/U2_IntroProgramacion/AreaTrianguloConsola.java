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
public class AreaTrianguloConsola {
    
    public static void main(String[] args) {
       
        /*Por consola*/
        Scanner T = new Scanner(System.in);
        double a,b,h;
        
        System.out.println("Ingresa la base del triangulo");
        b = T.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        h = T.nextDouble();
        
        a = (b*h)/2;
        
        System.out.println("El area del triangulo es "+a);
        
        
       
    }
    
  
}
