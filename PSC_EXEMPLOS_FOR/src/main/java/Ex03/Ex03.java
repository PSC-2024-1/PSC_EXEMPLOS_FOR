/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa em Java que calcule os primeiros N números da 
    sequência de Fibonacci: 1,1,2,3,5,8,13,21.*/
        Scanner input = new Scanner(System.in);
        int n, termo1 = 1, termo2 = 1, termoAux;

        System.out.println("Quantos números da sequência de Fibonacci quer gerar? ");
        n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.print(termo1 + " ");

            // Calcula o próximo termo da sequência
            termoAux = termo1 + termo2;
            termo1 = termo2;
            termo2 = termoAux;
        }
    }

}
