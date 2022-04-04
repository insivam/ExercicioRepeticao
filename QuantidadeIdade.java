/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/

import java.util.Scanner;

public class QuantidadeIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int idade = 0, ContadorMenor = 0, ContadorMaior = 0; // declaração de variáveis

        // recebe e calcula se o número é par ou ímpar
        while (true) {
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();

            if (idade == -99) // condição de parada
                break;

            if (idade < 21)
                ContadorMenor++;
            else if (idade > 50)
                ContadorMaior++;

        }

        // Imprime o resultado
        System.out.println("Quantidade de pessoas com menos de 21 anos: " + ContadorMenor);
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + ContadorMaior);
        ler.close();
    }
}