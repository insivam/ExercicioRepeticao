//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int numero, ContadorPar = 0, ContadorImpar = 0; // declaração de variáveis

        // Recebe e calcula se o número é par ou ímpar
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                ContadorPar++;
            } else {
                ContadorImpar++;
            }
        }

        // Imprime o resultado
        System.out.println("Quantidade de números pares: " + ContadorPar);
        System.out.println("Quantidade de números ímpares: " + ContadorImpar);
        ler.close();
    }
}