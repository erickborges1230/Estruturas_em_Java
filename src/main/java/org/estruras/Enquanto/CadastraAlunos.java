package org.estruras.Enquanto;

import java.util.Scanner;

public class CadastraAlunos {
    public static void main(String[] args) {
        String nome, endereco, telefone;
        int matricula, cont=0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar a matricula");
        matricula = teclado.nextInt();
        while (matricula != 0){
            System.out.println("Favor informar o nome");
            nome = teclado.next(); //String recebe somente next
            System.out.println("Favor informar o endereço");
            endereco = teclado.next();
            System.out.println("Favor informar o telefone");
            telefone = teclado.next();
            cont++;
            System.out.println("Favor informar a matrícula do próximo aluno");
            matricula = teclado.nextInt();
        }

    }
}
