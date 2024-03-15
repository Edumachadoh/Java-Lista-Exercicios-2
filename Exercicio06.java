/* Média ponderada = */
public class Exercicio06 {
    public static void executar() {
        double[] notas = new double[5];
        double[] pesos = new double[5];

        Prompt.imprimir("Notas: ");
        for (int i = 0; i < 5; i ++) {
            notas[i] =Prompt.lerDecimal("Nota: ");
        }

        Prompt.imprimir("Pesos: ");
        for (int i = 0; i < 5; i ++) {
            pesos[i] =Prompt.lerDecimal("Pesos: ");
        }

        double mediaP = ((notas[1] * pesos[1]) + (notas[2] * pesos[2]) + (notas[3] * pesos[3]) + (notas[4] * pesos[4]) + (notas[5] * pesos[5])) / 
        (pesos[1] + pesos[2] + pesos[3] + pesos[4] + pesos[5]);

        Prompt.imprimir("Media ponderada: " + mediaP);
     }
}
