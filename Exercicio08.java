/* Concatenar dois vetores em C*/
public class Exercicio08 {
    public static void executar() {
        double[] A = new double[5];
        double[] B = new double[5];
        
        double[] C = new double[10];

        Prompt.imprimir("Vetor A: ");
        for (int i = 0; i < 5; i ++) {
            A[i] = Prompt.lerDecimal("Valor: ");
            C[i] = A[i];
        }

        Prompt.imprimir("Vetor B: ");
        for (int i = 0; i < 5; i ++) {
            B[i] = Prompt.lerDecimal("Valor: ");
            C[i + 5] = B[i];''
        }

        Prompt.imprimir("Imprimindo vetor C: ");
        for (int i = 0; i < 10; i ++) {
            Prompt.imprimir("Vetor"+i+": "+ C[i]);
            
        }

     }
}
