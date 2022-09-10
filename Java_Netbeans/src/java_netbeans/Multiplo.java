/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_netbeans;

import java.util.Scanner;

/**
 *
 * @author wob19
 */
public class Multiplo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        System.out.println("Condicionales 02");
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        n = Integer.parseInt(Leer.nextLine());
        
        if (n%3==0 && n%5==0){
            System.out.println("El número "+ n + " es múltplo de 3 y 5.");
        } else {
            System.out.println("El número "+ n + " no es múltplo de 3 y 5.");
        }
    }
}
