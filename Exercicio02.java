/*Escreva um algoritmo que leia em um vetor uma sequência finita de númerosdigitados pelo usuário e, logo após, mostre o número de cada posição do vetor e seele é positivo, negativo ou zero */
public class Exercicio02 {
    public static void executar() {
        int cont = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        double[] vet = new double[cont];

        for (int i = 0; i < cont; i ++) {
            vet[i] = Prompt.lerDecimal("Valor: ");
            
        }

        for (int p = 0; p < cont; p ++) {
            System.out.printf("Vetor[%d]: ", p);
            if (vet[p] > 0) {
                System.out.printf("Positivo\n");
            } else  if (vet[p] < 0) {
                System.out.printf("Negativo\n");
            } else if (vet[p] == 0) {
                System.out.printf("Zero\n");
            }
        }

        
    }
}
