package Ll3_ControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Demo02_SentenciaIF {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre ");
         nombre = entrada.nextLine();
        
        if(nombre.equalsIgnoreCase("Hugo")){
            System.out.println("Hola "+nombre.toUpperCase());
        }
        
        
        
    }
    
}
