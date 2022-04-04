/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */

import java.util.Scanner;

public class MediaMultiplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int numero = 0, soma = 0, Contador = 0; // declaração de variáveis

        // Recebe e calcula se o número é par ou ímpar
        do {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();

            if (numero != 0) {
                if (numero % 3 == 0) {
                    soma += numero;
                    Contador++;
                }
            }

        } while (numero != 0);

        System.out.println("A média dos números múltiplos de 3 é: " + (soma / Contador));
        ler.close();
    }
}