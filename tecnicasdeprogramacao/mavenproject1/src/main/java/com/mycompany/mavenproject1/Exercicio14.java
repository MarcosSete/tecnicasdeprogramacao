/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Marcos Gabriel Soares Cruz  <marcossetecruzsoares@gmail.com>
 */
public class Exercicio14 {
    
    public static void main(String[] args) {
        int limite = 1000;
        int quantidadePrimos = 0;

        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                quantidadePrimos++;
            }
        }

        System.out.println("A quantidade de números primos entre 1 e 1000 é: " + quantidadePrimos);
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    

