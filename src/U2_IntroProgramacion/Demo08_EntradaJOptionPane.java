/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_IntroProgramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author HugoLuna
 */
public class Demo08_EntradaJOptionPane {
    
    public static void main(String[] args) {
        int a, b, suma;
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor"));
        System.out.println("A = "+a);
        /*Suma de dos valores*/
        suma  = a+b;
        JOptionPane.showMessageDialog(null, "La suma de "+a+" + "+b+" es igual a "+suma);
        /*Resta de dos valores*/
        suma  = a-b;
        JOptionPane.showMessageDialog(null, "La resta de "+a+" - "+b+" es igual a "+suma);
        
        /*Multiplicacion de dos valores*/
        suma  = a*b;
        JOptionPane.showMessageDialog(null, "La multiplicacion de "+a+" * "+b+" es igual a "+suma);
        
        /*Divison de dos valores*/
        suma  = a/b;
        JOptionPane.showMessageDialog(null, "La division de "+a+" / "+b+" es igual a "+suma);
        
        /*Modulo de dos valores*/
        suma  = a%b;
        JOptionPane.showMessageDialog(null, "El modulo de "+a+" % "+b+" es igual a "+suma);
        
    }
}
