public class дз14 {
    public static int[] createIntArray(int len, int initialValue) {
        System.out.println("\nex 14");
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(newArr[i] = initialValue);
        }
        return newArr;
    }
}
