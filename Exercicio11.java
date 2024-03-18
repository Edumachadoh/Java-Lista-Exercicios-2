/* Produto escalar*/
public class Exercicio11 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];
        
        

        Prompt.imprimir("Vetor A: ");
        for (int i = 0; i < 5; i ++) {
            A[i] = Prompt.lerInteiro("Valor: ");
            
        } 
        Prompt.imprimir("Vetor B: ");
        for (int i = 0; i < 5; i ++) {
            B[i] = Prompt.lerInteiro("Valor: ");
        } 

        double PE = A[0] * B[0] + A[1] * B[1] + A[2] * B[2] + A[3] * B[3] + A[4] * B[4];

        Prompt.imprimir("Produto escalar: " + PE);
        
     }
}
