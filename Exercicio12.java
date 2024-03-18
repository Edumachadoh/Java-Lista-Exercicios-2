/* Produto escalar*/
public class Exercicio12 {
    public static void executar() {
       double[] vet = new double[12];
        double prod = 1;

       Prompt.imprimir("Vetor de 12 elementos: ");
       for (int i = 0; i < 12; i ++) {
        vet[i] = Prompt.lerDecimal("Valor: ");
        if ((vet[i] > 0) && (vet[i] % 2 == 0)) {
            prod *= vet[i];
        }
       }

       Prompt.imprimir("Produto dos valores pares positivos: " + prod);
     }
}
