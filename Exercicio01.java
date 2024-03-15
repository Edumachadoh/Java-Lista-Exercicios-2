/*Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário, calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média */
public class Exercicio01 {
    public static void executar() {
        double[] vet = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i ++) {
            vet[i] = Prompt.lerDecimal("Digite o valor " +i + ":");
            soma += vet[i];
        }

        double media = soma / 5;
        System.out.printf("A média é: %.1f\n", media);

        for (int i = 0; i < 5; i ++) {
            if (vet[i] > media) {
                System.out.printf("%.1f é maior que a média\n", vet[i]);
            } else if (vet[i] == media) {
                System.out.printf("%.1f é igual a média\n", vet[i]);
            } else if (vet[i] < media) {
                System.out.printf("%.1f é menor que a média\n", vet[i]);
            }

        }
    }
}
