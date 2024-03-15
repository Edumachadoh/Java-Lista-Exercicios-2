/* Elabore um programa que leia 5 números do teclado e os armazene em um vetor.Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor. */
public class Exercicio05 {
    public static void executar() {
        double[] vet = new double[5];
        int cont = 0;

        for (int i = 0; i < 5; i ++) {
            vet[i] = Prompt.lerDecimal("Valor: ");
        }
        
        double n = Prompt.lerDecimal("Digite um valor para comparar: ");

        for (int i = 0; i < 5; i ++) {
            if (vet[i] == n) {
                cont ++;
            }
        }

        Prompt.imprimir( n + " aparece " + cont + " vez(es)");
        
    }
}
