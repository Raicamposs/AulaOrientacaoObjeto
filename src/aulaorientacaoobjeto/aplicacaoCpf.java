/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaorientacaoobjeto;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Raiane Campos
 */
public class aplicacaoCpf {

    public String cpfParseString() {
        String numCpf = null;
        Boolean confere = false;
        while (!confere == true) {

            numCpf = JOptionPane.showInputDialog(null, "Qual Numero do Cpf?\nInsira apenas os digitos: ");
            if (numCpf == null) {
                System.exit(0);
            } else {
                numCpf = numCpf.trim();
                if (JSType.isNumber(numCpf) && numCpf.length() == 11) {
                    confere = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Numero de Cpf esta com formato incorreto!");

                }
            }
        }
        return numCpf;
    }

    //calcular o numero dv do seu cpf apartir dos outros numeros 
    public int dvCpf(int num, String numCpf) {

        int j = num;
        int soma = 0;

        for (int i = 0; i < (num - 1); i++) {
            String digito = "" + numCpf.charAt(i);
            int digitoCpf = Integer.parseInt(digito);
            soma += (digitoCpf * j);
            j--;
        }

        return soma;

    }

    public int calculoDigito(int sm) {
        return 11 - (sm % 11);
    }
}
