package org.estruras.Enquanto;

import javax.swing.*;

public class ContasApagar {
    public static void main(String[] args) {
        var descricao_conta = JOptionPane.showInputDialog("Digite o nome da conta");
        var valor = Double.parseDouble(JOptionPane.showInputDialog("Digite seu valor"));
        int numero_contas = 0;
        double valor_total = 0;
        while (valor>0){
            JOptionPane.showMessageDialog(null, "Conta "+descricao_conta+" - valor:R$ "+valor);
            numero_contas++; //Acumulador
            valor_total = valor_total + valor;
            descricao_conta = JOptionPane.showInputDialog("Digite o nome do conta");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite seu valor"));
        }
        JOptionPane.showMessageDialog(null, "Número de Contas(s) "+numero_contas+" - valor"+valor_total);
    }
}
