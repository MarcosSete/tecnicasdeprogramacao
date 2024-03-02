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
public class Exercicio13 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário os valores de x e y
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();

        int resultado = 1;

        // Calcular x^y utilizando um loop for
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        // Exibir o resultado
        System.out.println("O resultado de " + x + "^" + y + " é: " + resultado);

        scanner.close();
    }
}


