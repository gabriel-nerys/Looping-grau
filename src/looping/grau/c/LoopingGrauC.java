/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.grau.c;

/**
 *
 * @author Luciana
 */
import java.util.Scanner;

public class LoopingGrauC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada;
        double i, f;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Dígite o grau C°: ");
        f = entrada.nextDouble();
        i = 1;
        
        while (i < 10)
        {
            f = (i * 9/5) + 32;
            System.out.println(f);
            i++;
        }
    }
    
}
