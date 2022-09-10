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
public class Condicionales_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int mayor, n1, n2;
        
        System.err.println("Condicionales");
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        n1 = Integer.parseInt(Leer.nextLine());
            
        System.out.println("Ingrese el segundo numero: ");
        n2 = Integer.parseInt(Leer.nextLine());
        
        if (n1>n2){
            mayor = n1;
        } else {
            mayor = n2;
        }
        
        System.out.println("El numero mayor es: " + mayor);
    }
}
