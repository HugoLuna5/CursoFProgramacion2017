/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_IntroProgramacion;

/**
 *
 * @author HugoLuna
 */
public class Demo04_Operadores {
    
    public static void main(String[] args) {
    
        
        int a= 10, b=5;
        
        float x=5.3F,y = 20.33F;
        
        //
        int suma = a+b;
        int resta = a-b;
        int producto = a*b;
        int cociente =a/b;
        int modulo = a%b;
        
        System.out.println("La suma de "+a+" + "+b+" es igual a" +suma);
        System.out.println("La resta de "+a+" - "+b+" es igual a "+resta);
        System.out.println("El producto de "+a+" * "+b+" es igual a "+producto);
        System.out.println("El cociente de "+a+" / "+b+" es igual a "+cociente); 
        System.out.println("El modulo de "+a+" % "+b+" es igual a "+modulo);
    }
    
}
