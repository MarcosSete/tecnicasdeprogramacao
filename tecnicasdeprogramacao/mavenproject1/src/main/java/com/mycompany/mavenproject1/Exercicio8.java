/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Marcos Gabriel Soares Cruz  <marcossetecruzsoares@gmail.com>
 */
import java.util.Scanner;
public class Exercicio8 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário os valores de a e b
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        // Determinar o maior valor entre a e b usando o operador ternário
        int maior = (a > b) ? a : b;

        // Exibir os valores de a, b e o maior valor
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("O maior valor digitado é: " + maior);

        scanner.close();
    }
}

    

