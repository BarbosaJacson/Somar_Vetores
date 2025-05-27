package sum;

public class Vectors {
    public int[] calculateResultingVector(int[] vectorA, int[] vectorB) {
        int[] vectorR = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorR[i] = vectorA[i] + vectorB[i];
        }
        return vectorR;
    }
}