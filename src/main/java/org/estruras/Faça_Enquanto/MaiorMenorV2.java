package org.estruras.Faça_Enquanto;

import java.util.Scanner;

public class MaiorMenorV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor, maior, numero,i;
        System.out.println("Favor informar o valor");
        numero = teclado.nextInt();
        maior=numero;
        menor=numero;

        do {
            if (numero < menor)
                menor = numero;
            else if (numero > maior)
                maior = numero;
                System.out.println("Favor informar o valor");
                numero = teclado.nextInt();
        }
        while (numero != 0) ;
        System.out.println("O menor número informado foi " + menor + " e o maior número informado foi " + maior);
    }
}
