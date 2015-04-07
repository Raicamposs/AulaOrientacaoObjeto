/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaorientacaoobjeto;

import javax.swing.JOptionPane;


public class Exercicio {

    public void BalancoTrimestral() {
        int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000, mediaMensal;
        int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;

        mediaMensal = (gastosTrimestrais / 3);
        System.out.println(" Gastos Trimestrais = " + gastosTrimestrais + "\n Valor da Media Mensal = " + mediaMensal);

    }

    public void ExercicioNumero1() {

        //1.Imprima todos os números de 120 a 530
        for (int i = 120; i <= 530; i++) {
            System.out.println(i);
        }

    }

    public void ExercicioNumero2() {

        //2.Imprima a soma de 1 até 1000
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void ExercicioNumero3() {

        //3.Some todos os múltiplos de 3, entre 1 e 100
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                soma += i;
            }

        }
        System.out.println(soma);
    }

    public void ExercicioNumero4() {

        //4.Imprima os fatoriais de 1 a 10
        int fatorial, aux;

        for (int i = 1; i <= 10; i++) {
            fatorial = 1;
            aux = i;
            while (aux > 1) {
                fatorial = fatorial * (aux);
                aux--;
            }
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }
    }

    public void ExercicioNumero5(int x) {

//5.Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
//•se x é par, x = x / 2
//•se x é impar, x = 3 * x + 1
//•imprime x
//•O programa deve parar quando x tiver o valor final de 1.
//•Exemplo para x = 13 , a saída será:
//•40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
        System.out.println("Valor de x = " + x);
        while (x > 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = ((3 * x) + 1);
            }
            System.out.print(" -> " + x);
        }

    }

    public void ExercicioNumero6() {
        aplicacaoCpf aplicacao = new aplicacaoCpf();
        String cpf = aplicacao.cpfParseString();
        String digitosFinais = "" + aplicacao.calculoDigito(aplicacao.dvCpf(10, cpf)) + aplicacao.calculoDigito(aplicacao.dvCpf(11, cpf));
        if (cpf.endsWith(digitosFinais)) {
            JOptionPane.showMessageDialog(null, "Cpf Valido!");
        } else {
            JOptionPane.showMessageDialog(null, "Cpf Invalido!");
        }

    }

}
