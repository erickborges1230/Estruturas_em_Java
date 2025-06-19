package org.estruras;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        double fatorial = 1;
        int numero;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar um número");
        numero = teclado.nextInt();
        int i = numero;

        while (i >= 1){
            fatorial = fatorial * i;
            i--; //Numero = numero - 1
        }
        System.out.println("O fatorial do número: "+numero+" = "+fatorial);
    }
}
