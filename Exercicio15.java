/* somente numeros maior que o anterior*/
public class Exercicio15 {
    public static void executar() {
        double[] vet = new double[5];

        for (int i = 0; i < 5; i ++) {
            if (i == 0) {
                vet[i] = Prompt.lerDecimal("Valor: ");
            } else { 
                do {
                    vet[i] = Prompt.lerDecimal("Valor: ");
                    if (vet[i] < vet[i-1]) {
                       Prompt.imprimir("Digite um valor maior...");
                    }
                } while (vet[i] < vet[i-1]);
            }

            
        }

        Prompt.imprimir("Imprimindo vetor:");
        for (int i = 0; i < 5; i ++) {
            System.out.printf("%.1f  ", vet[i]);

            
        }







    }
}