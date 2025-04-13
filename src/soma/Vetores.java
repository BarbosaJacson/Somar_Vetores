package soma;

public class Vetores {
    public int[] calcularVetorResultante(int[] vetorA, int[] vetorB) {
        int[] vetorR = new int[vetorA.length]; // Mesmo tamanho de vetorA e vetorB
        for (int i = 0; i < vetorA.length; i++) {
            vetorR[i] = vetorA[i] + vetorB[i]; // Soma dos elementos correspondentes
        }
        return vetorR;
    }
}