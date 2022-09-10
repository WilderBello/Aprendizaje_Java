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
public class CocienteyResiduo {
    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(Leer.nextLine());
            
        System.out.println("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(Leer.nextLine());
            
        int c = (n1/n2);
        int r = (n1%n2);
            
        System.out.println("Cociente: " + c);
        System.out.println("Residuo: " + r);
    }
}
