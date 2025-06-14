package org.estruras;

import java.util.Scanner;

public class MostrarTabuada {
    public static void main(String[] args) {
        int i, numero, total=1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número");
        numero = teclado.nextInt();

        for(i=0; i<=10; i++){
            total = numero * i;
            System.out.println("Numero: "+numero+"x"+i+" = "+total);
        }
    }
}