/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_IntroProgramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoLuna
 */
public class AreaTrinaguloDialogo {

    public static void main(String[] args) {
       

        double a,b,h;
           
        
         
        /*Por dialogo*/
         b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la base del triangulo"));
         h = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la altura del triangulo"));
         
         a = (b*h)/2;
         
        JOptionPane.showMessageDialog(null, "El area del tringulo es "+a);

         
         
    }
}
