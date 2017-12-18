/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U4_Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author HugoLuna
 */
public class Demo02_Arreglos2D {
    private int matriz[][];
    
    //Constructor de la clase
    public Demo02_Arreglos2D(){
    
        System.out.println("Soy el constructor");
    }
    
    
    public static void main(String[] args) {
        Demo02_Arreglos2D mat =  new Demo02_Arreglos2D(); 
         int numero1 = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el dato ","Tamaño en filas de la matriz",JOptionPane.OK_CANCEL_OPTION));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el dato ","Tamaño en columnas de la matriz",JOptionPane.OK_CANCEL_OPTION));
         
        mat.crearArreglo2D(numero1, numero2);
        mat.insertarDatosArreglo2D();
        mat.mostrarElementosArreglo2D();
        
       
    String dato = JOptionPane.showInputDialog
                (null, "Desea buscar algun numero en la matriz","Busqueda en la Matriz",JOptionPane.OK_CANCEL_OPTION);
    
    
                if(dato.equalsIgnoreCase("SI")){
                    
                    int numeroBuscar = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingresa tu numero a buscar","Busqueda en la Matriz",JOptionPane.OK_CANCEL_OPTION));
               
               mat.buscarElementosArreglo2D(numeroBuscar);
                
                }
                
        
        
        
    }
    
    
    
    
    public void crearArreglo2D(int f, int c){
        matriz =  new int[f][c];
    }
    
    public void insertarDatosArreglo2D(){
        int f = matriz.length, c = matriz[0].length;
        
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                
                int dato = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el dato ["+i+"]["+j+"]: ","Llenado Matriz",JOptionPane.OK_CANCEL_OPTION));
                matriz[i][j] = dato;
            }
            
        }
        
        
    }
    
    public void mostrarElementosArreglo2D(){
        int f = matriz.length, c = matriz[0].length;
        String datosMatriz = "";
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                 datosMatriz = datosMatriz + matriz[i][j] +"  ";
               
            }
            System.out.println("");
             datosMatriz = datosMatriz + "\n";
        }
        
        JOptionPane.showMessageDialog(null, datosMatriz, 
                "Info - Matriz", 
                JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    public void buscarElementosArreglo2D(int numero){
        int f = matriz.length, c = matriz[0].length;
        boolean Exist = false;
             for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if(matriz[i][j] == numero){
                 JOptionPane.showMessageDialog(null,"Tu numero se encuentra en la posición ["+i+"]["+j+"]","Busqueda",JOptionPane.OK_OPTION);

                 Exist = true;
                }

            }
           
        }
             if(Exist == false){
              JOptionPane.showMessageDialog(null,"Tu numero no se encuentra en la matriz ","Busqueda",JOptionPane.OK_OPTION);
               }
        
        
    
    }
}
