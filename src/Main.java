import sum.Vectors;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        int n=0;
        int i=0;

        System.out.printf("How many values will each vector have?? ");
        n= scanner.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        Vectors vectors = new Vectors();
        System.out.println("Enter the value the of vector A: " );
        for (i = 0; i < n; i++) {
            vectorA[i] = scanner.nextInt();
        }
        System.out.println("Enter the value the of vector  B: " );
        for (i = 0; i < n; i++) {
            vectorB[i] = scanner.nextInt();
        }

        int[] vectorR = vectors.calculateResultingVector(vectorA, vectorB);

        System.out.print("Resulting vector: ");
        for (i = 0; i < vectorR.length; i++) {
            System.out.print(vectorR[i] + " ");
        }
        System.out.println();
    }
}