/* Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor */
public class Exercicio04 {
    public static void executar() {
       
        double[] vet = new double[5];
        
        double n = Prompt.lerDecimal("Valor de n: ");

        for (int i = 0; i < 5; i ++) {
            vet[i] = Prompt.lerDecimal("Valor: ");
        }

        Prompt.imprimir("Indice de numeros menores que n: ");
        for (int i = 0; i < 5; i ++) {
            if (vet[i] < n) {
                Prompt.imprimir(i);
            }
        }

        
    }
}
