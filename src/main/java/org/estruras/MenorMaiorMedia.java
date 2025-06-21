package org.estruras;

import java.util.Scanner;

public class MenorMaiorMedia {
    public static void main(String[] args) {
        double menor, maior, numero, media=0;
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.println("Favor informar o valor");
        numero = teclado.nextDouble();
        maior=numero;
        menor=numero;

        while (numero !=0 ){
            cont++;
            if (numero < menor)
                menor = numero;
            else if (numero > maior)
                maior = numero;
            media = media + numero;
            System.out.println("Favor informar o valor");
            numero = teclado.nextDouble();
        }
        media = media/cont;
        System.out.println("O menor valor é: "+menor);
        System.out.println("O maior valor é: "+maior);
        System.out.println("Media dos números são de "+media);
    }
}