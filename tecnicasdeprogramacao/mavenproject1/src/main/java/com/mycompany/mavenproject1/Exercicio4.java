/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Marcos Gabriel Soares Cruz  <marcossetecruzsoares@gmail.com>
 */
public class Exercicio4 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        
        double x;
        double y;
        double z;
        double cal;
        
        System.out.print ("Digite o primeiro valor: ");
        x = ler.nextInt();
        System.out.print ("Digite o segundo valor: ");
        y = ler.nextInt();
        System.out.print ("Digite o primeiro valor: ");
        z = ler.nextInt();
        
        
        
        cal = (x*y/z);
        
           System.out.print(cal);
        
    
    }
    
}
