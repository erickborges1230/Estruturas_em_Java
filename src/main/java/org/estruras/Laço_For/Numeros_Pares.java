package org.estruras.Laço_For;

import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número A");
        int a = teclado.nextInt();

        System.out.println("Favor informar o número B");
        int b = teclado.nextInt();

        for(int i=a+1; i<b; i++){ //Neste caso não está incluindo nem o A e nem o B.
            if(i%2==0)
                System.out.println("O número: "+i+" é par");
        }
    }
}
