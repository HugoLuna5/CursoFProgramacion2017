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
    
        System.out.println("Soy el Bob el constructor");
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
            }
            
        }
        
        
    }
}
