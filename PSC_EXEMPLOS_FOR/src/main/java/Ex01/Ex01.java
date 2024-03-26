/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Faça um programa em java que soma n números informados pelos usuários. 
        N também deve ser informado pelo usuário.*/
        Scanner input = new Scanner(System.in);
        int n, numero, soma = 0;
        System.out.println("Informe a quantidade de números:");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o número " + (i + 1) + ": ");
            numero = input.nextInt();
            soma += numero;
            System.out.print(numero + " ");
        }
        System.out.printf("A soma dos %d números informados é %d. ", n, soma);

    }
}
