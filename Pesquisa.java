/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
*/

import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int C = 1, Calma = 0, MulherNervosa = 0, HomemAgressivo = 0, OutrosCalmo = 0, // declaração de variáveis
                PessoasNervosa40 = 0, Calma18 = 0; // declaração de variáveis

        // Recebe e calcula se o número é par ou ímpar
        while (C <= 150) {
            System.out.println(C + "ª Pessoa");
            System.out.println("========================================");
            System.out.println("                 IDADE                 ");
            System.out.println("========================================");
            System.out.print("Minha idade é: ");
            int idade = ler.nextInt();

            System.out.println("========================================");
            System.out.println("                 SEXO                 ");
            System.out.println("========================================");
            System.out.println("Me identifico como: ");
            System.out.println("1- Feminino \n2- Masculino \n3- Outros\n");
            System.out.print("Digite o sexo: ");
            int sexo = ler.nextInt();

            System.out.println("========================================");
            System.out.println("                  OPÇÕES                 ");
            System.out.println("========================================");
            System.out.println("Sou uma pessoa: ");
            System.out.println("1- Calma \n2- Nervosa \n3- Agressiva\n");
            System.out.print("Digite a opção: ");
            int opcao = ler.nextInt();

            if (opcao == 1) // Conta quantas pessoas são calmas
                Calma++;

            if (sexo == 1 && opcao == 2) // Conta quantas mulheres são nervosas
                MulherNervosa++;
            if (sexo == 2 && opcao == 3) // Conta quantos homens são agressivos
                HomemAgressivo++;
            if (sexo == 3 && opcao == 1) // Conta quantos outros são calmos
                OutrosCalmo++;

            if (idade > 40 && opcao == 2) // Conta quantas pessoas são nervosas com mais de 40 anos
                PessoasNervosa40++;
            if (idade < 18 && opcao == 1) // Conta quantas pessoas são calmas com menos de 18 anos
                Calma18++;

            C++;
            System.out.println("\n");
        }

        // Imprime o resultado
        System.out.println("========================================");
        System.out.println("Pessoas calmas: " + Calma);
        System.out.println("Mulheres nervosas: " + MulherNervosa);
        System.out.println("Homens agressivos: " + HomemAgressivo);
        System.out.println("Outros calmos: " + OutrosCalmo);
        System.out.println("Pessoas nervosas com mais de 40 anos: " + PessoasNervosa40);
        System.out.println("Pessoas calmas com menos de 18 anos: " + Calma18);
        System.out.println("========================================");
        ler.close();
    }
}
