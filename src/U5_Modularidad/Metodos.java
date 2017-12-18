/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U5_Modularidad;

/**
 *
 * @author HugoLuna
 */
public class Metodos {
    public static void main(String[] args) {
        OpAritmeticas obj = new OpAritmeticas();
        //Llamada / Invocacion a los metodos
        
        obj.sumar(10, 20);
        obj.restar(10,20);
        obj.multiplicar(10, 20);
        obj.dividir(10,20);
        
        int suma = obj.getSuma();
        
        System.out.println("La suma es "+suma);
        
        double resta = obj.getResta();
        
        System.out.println("La resta es "+resta);
        
        double multiplicacion = obj.getMultiplicacion();
        
        System.out.println("La multiplicacion es "+resta);
        
        double division = obj.getDivision();
        
        System.out.println("La division es "+resta);
        
        
    }
}
