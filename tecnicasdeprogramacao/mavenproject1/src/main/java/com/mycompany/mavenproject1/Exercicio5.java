/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  /*
MIT License

Copyright (c) 2024 Marcos G. S. C. Sete

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
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

        

    
