/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author nadir.allub
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        JorgeClass jorge = new JorgeClass();
        
        System.out.print("Introduce la primera nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Introduce la segunda nota: ");
        float n2 = teclado.nextFloat();
        System.out.print("Introduce la tercera nota: ");
        float n3 = teclado.nextFloat();
        
        float promedio = jorge.promedioNota(n1, n2, n3);
        String mensaje = jorge.conclusionFinal(promedio);
        
        System.out.println("Promedio obtenido: " + promedio);
        System.out.println("Conclusion final: " + mensaje);
    }
    
}
