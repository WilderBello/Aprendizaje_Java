/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_netbeans.ManejodeVariables;

import java.util.Scanner;

/**
 *
 * @author wob19
 */
public class SumayResta {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int a = Integer.parseInt(Leer.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        int b = Integer.parseInt(Leer.nextLine());
        
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
    }
}
