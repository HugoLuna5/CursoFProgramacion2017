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
public class Demo06_Metodo {
 
    public static void main(String[] args) {
        int retorno;
        Scanner T = new Scanner(System.in); 
        String nombre;
        int a,b;
        
        /*
        crear objeto para instanciar metodo a la clase*/
         Demo06_Metodo obj =  new Demo06_Metodo();
         
         /*System.out.println("Escribe tu nombre");
         nombre = T.nextLine();*/
        //instanciar el metodo mensaje()
        //obj.mensaje(nombre);
        /*System.out.println("Escribe el valor de a");
        a = T.nextInt();
        System.out.println("Escribe el valor de b");
        b = T.nextInt();
        obj.mensaje2(a, b);*/
        
        System.out.println("Escribe el valor de a");
        a = T.nextInt();
        System.out.println("Escribe el valor de b");
        b = T.nextInt();
        
        retorno = obj.mensaje3(a,b);
        System.out.println("Resultado de la suma de "+a+" + "+b+" es igual a "+retorno);
       //mostrar mensajes cuando es static 
        //mensaje();
        
    }
    
    public  void mensaje(String nombre){
        //System.out.println("Este es un mentodo si retorno y sin parametros ");

        System.out.println("Este es un mentodo si retorno y con parametros, Bienvenido "+nombre);
    }
    
    public void mensaje2(int a, int b){
        System.out.println("Este es un metodo sin retorno y con parametros");
        System.out.println("Parametro a "+a);
        System.out.println("Parametro b "+b);
    }   

    public int mensaje3(int a, int b){
        
        String msg = "Metodo con retorno y con parametros";
        int c= a+b;
        return c;
    }
    
}
