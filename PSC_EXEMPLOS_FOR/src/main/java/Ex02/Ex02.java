/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa em java que calcula o fatorial de um número 
         informado pelo usuário.*/
        Scanner input = new Scanner(System.in);
        int n, fatorial = 1;
        
        System.out.println("Informe um número para calcular o fatorial:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial *= i; // fatorial = fatorial * i;
        }
        System.out.printf("O fatorial de %d é %d ", n, fatorial);
    }

}
