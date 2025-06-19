package org.estruras;

import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor, maior, numero,i;
        numero = teclado.nextInt();
        maior=numero;
        menor=numero;

        for (i=2; i<10; i++){
            numero = teclado.nextInt();
            if(numero<menor){
                menor = numero;
            }
            else if (numero>maior) {
                maior=numero;
            }
        }
        System.out.println("O menor número informado foi "+menor+" e o maior número informado foi "+maior);
    }
}
