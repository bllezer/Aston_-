public class дз13 {
    public static void fillDiagonalOnes(int[][] array) {
        System.out.println("\n\nex 13");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
