package Labreport.L28;

public class RaggedArray {
    int[][] x = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
    };

    void printArray() {
        System.out.println("Array Elements by Row:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RaggedArray obj = new RaggedArray();
        obj.printArray();
    }
}
