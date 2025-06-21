package org.estruras;

import java.util.Scanner;

public class FatorialV2 {
    public static void main(String[] args) {
        double fatorial = 1;
        int numero;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar um número");
        numero = teclado.nextInt();
        int i = numero;
        do
        {
            fatorial = fatorial * i;
            i--; //Numero = numero - 1
        }while (i >= 1);
        System.out.println("O fatorial do número: "+numero+" = "+fatorial);
    }
}
