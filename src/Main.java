import soma.Vetores;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        int n=0;
        int i=0;

        System.out.printf("Quantos valores vai ter cada vetor? ");
        n= scanner.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        Vetores vetores = new Vetores(); // Instância da classe Vetores para processar
        System.out.println("Digite os valores do vetor A: " );
        for (i = 0; i < n; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B: " );
        for (i = 0; i < n; i++) {
            vetorB[i] = scanner.nextInt();
        }
        // Calcula o vetor resultante
        int[] vetorR = vetores.calcularVetorResultante(vetorA, vetorB);

        // Exibe o vetor resultante
        System.out.print("Vetor resultante: ");
        for (i = 0; i < vetorR.length; i++) {
            System.out.print(vetorR[i] + " ");
        }
        System.out.println();
    }
}