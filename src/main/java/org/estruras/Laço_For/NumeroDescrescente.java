package org.estruras.Laço_For;

import java.util.Scanner;

public class NumeroDescrescente {
    public static void main(String[] args) {
        int numero = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número ");
        numero = teclado.nextInt();

        for (int i = numero; i>=1; i=i-1 ){
            System.out.println("Numero = "+i);
        }
    }
}
