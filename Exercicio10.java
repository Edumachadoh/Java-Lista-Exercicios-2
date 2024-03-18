/* Concatenar dois vetores em C*/
public class Exercicio10 {
    public static void executar() {
        double[] A = new double[5];
        double[] B = new double[5];
        
        

        Prompt.imprimir("Vetor A: ");
        for (int i = 0; i < 5; i ++) {
            A[i] = Prompt.lerDecimal("Valor: ");
            
        } 
        
        for (int i = 4; i >= 0; i --) {
            B[i] = A[4-i];
            Prompt.imprimir("Valor: " + B[i]);
        } 

        Prompt.imprimir("Vetor B(inversão de A): ");
        for (int i = 0; i < 5; i ++) {
           
            Prompt.imprimir("Valor: " + B[i]);
        } 

        
     }
}
