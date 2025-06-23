package org.estruras.Laço_For;

import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        int numero_divisores = 0;

        for(int i=1; i <= numero; i++)
        {
            if(numero%i == 0)
                numero_divisores++;
        }
        if (numero_divisores == 2)
            JOptionPane.showMessageDialog(null, "Número de divisores "+numero+" é primo");
        else
            JOptionPane.showMessageDialog(null, "O número "+numero+" não é primo");
    }
}
