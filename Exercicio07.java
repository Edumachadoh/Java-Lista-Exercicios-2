/* Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem coincidir*/
public class Exercicio07 {
    public static void executar() {
        
        double[] vet1 = new double[5];
        double[] vet2 = new double[5];
        int cont = 0 ;

        Prompt.imprimir("Vetor 1: ");
        for (int i = 0; i < 5; i ++) {
            vet1[i] = Prompt.lerDecimal("Valor: ");
        } 

        Prompt.imprimir("Vetor 2: ");
        for (int i = 0; i < 5; i ++) {
            vet2[i] = Prompt.lerDecimal("Valor: ");
        } 

        for (int i = 0; i < 5; i ++) {
            if (vet1[i] == vet2[i]) {
                cont ++;
            }
            Prompt.imprimir(cont);
        } 

        if (cont == 5) {
            Prompt.imprimir("Vetores IGUAIS");
        } else  {
            Prompt.imprimir("Vetores DIFERENTES");
        }

     }
}
