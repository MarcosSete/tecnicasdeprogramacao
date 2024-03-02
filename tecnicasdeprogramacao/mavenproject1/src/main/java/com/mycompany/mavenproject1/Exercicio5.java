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
public class Exercicio5 {
    public static void main (String [] args){
        
        
        


        Scanner scanner = new Scanner(System.in);

        // Solicitar a velocidade ao usuário
        System.out.print("Digite a velocidade do carro em km/h: ");
        double velocidade = scanner.nextDouble();

        // Solicitar o tempo da viagem ao usuário
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempo = scanner.nextDouble();

        // Calcular a distância
        double distancia = velocidade * tempo;

        // Exibir os resultados
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo da viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");

        scanner.close();
    }
}

        

    