/* Concatenar dois vetores em C*/
public class Exercicio09 {
    public static void executar() {
        double[] A = new double[5];
        double[] B = new double[5];
        double[] C = new double[6];
        

        Prompt.imprimir("Vetor A: ");
        for (int i = 0; i < 5; i ++) {
            A[i] = Prompt.lerDecimal("Valor: ");
            if (i == 0) {
                C[0] = A[i];
            } else if (i % 2 == 0) {
                C[i] = A[i];
            }
        } 

        Prompt.imprimir("Vetor B: ");
        for (int i = 0; i < 5; i ++) {
            B[i] = Prompt.lerDecimal("Valor: ");
            if (i % 2 == 1) {
                C[i] = B[i];
            }
        } 

        Prompt.imprimir("Vetor C: ");
        for (int i = 0; i < 5; i ++) {
            Prompt.imprimir("Vetor" + i+": "+ C[i]);
        } 

     }
}
