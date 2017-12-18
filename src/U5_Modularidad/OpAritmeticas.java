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
public class OpAritmeticas {
    int suma= 0;
    double resta = 0,multiplicacion = 0,dividir=0;
    
    /**
     * Metodo que realiza la suma
     * @param a Número de tipo entero
     * @param b Número de tipo entero
     * @return suma - Resultado de la suma de a + b de tipo entero
     */
    public void sumar(int a,int b){
    
        suma = a+b;
    
    }
    
    /**
     * Metodo que realiza la resta
     * @param a Número de tipo entero
     * @param b Número de tipo entero
     * @return resta - Resultado de la suma de a - b de tipo entero
     */
    public void restar(int a,int b){
    
        resta = a-b;
    
    }
    /**
     * Metodo que realiza la multiplicacion
     * @param a Número de tipo entero
     * @param b Número de tipo entero
     * @return multiplicacion - Resultado de la suma de a * b de tipo entero
     */
    public void multiplicar(int a,int b){
    
        multiplicacion = a*b;
    
    }
    
     /**
     * Metodo que realiza la division
     * @param a Número de tipo entero
     * @param b Número de tipo entero
     * @return multiplicacion - Resultado de la suma de a * b de tipo entero
     */
    public void dividir(int a,int b){
    
        dividir = a/b;
    
    }
    
    
    
    
    
    /**
     * Metodo que regresa la suma de dos números enteros
     */
    public int getSuma(){
    
    return suma;
    }
    
    public double getResta(){
    
    return resta;
    }
    public double getMultiplicacion(){
    
    return multiplicacion;
    }  
    
    public double getDivision(){
    
    return dividir;
    }  
           
   
    
    
    
    
    
    
}
