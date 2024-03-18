/* fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}.*/
public class Exercicio13 {
    public static void executar() {
        int n;
        n = Prompt.lerInteiro("Tamanho de Fibonacci: ");

        int[] fib = new int[n];

        Prompt.imprimir("Vetor = ");
        for (int i = 0; i < n; i ++) {
            if (i == 0) {
                fib[i] = 1;
            } else if (i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i-1] + fib[i-2];
            }

            System.out.printf("%d ", fib[i]);
        }
     }
}
