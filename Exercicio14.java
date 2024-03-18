/* organizar menor elemento*/
public class Exercicio14 {
    public static void executar() {
        double[] vet = new double[5];
        double maior = 0;
        int contMaior = 0;
        double posNum;

        Prompt.imprimir("Ler vetor:");
        for (int i = 0; i < 5; i ++) {
            vet[i] = Prompt.lerDecimal("Valor: ");
            if (i == 0) {
                maior = vet[i];
                contMaior = i; 
            } else {
                if (vet[i] > maior) {
                    maior = vet[i];
                    contMaior = i;
                }
            }
        }
        posNum = vet[4];
        vet[contMaior] = posNum; 
        vet[4] = maior;

        Prompt.imprimir("Imprimir vetor:");
        for (int i = 0; i < 5; i ++) {
            System.out.printf("%.1f ", vet[i]);
        }

     }
}
