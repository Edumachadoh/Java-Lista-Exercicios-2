/* Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor */
public class Exercicio03 {
    public static void executar() {
        int cont = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        double[] vet = new double[cont];
        double[] vetDobro = new double[cont];

        for (int i = 0; i < cont; i ++) {
            vet[i] = Prompt.lerDecimal("Valor: ");
            vetDobro[i] = vet[i] * 2;
        }

        for (int i = 0; i < cont; i ++) {
            System.out.printf("Vet dobro[%d]: %.1f\n", i, vetDobro[i]);
        }
        
    }
}
