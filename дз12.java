public class дз12 {
    public static void modifyArrayValues(int[] array, int count) {
        System.out.println("\n\nex 12");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < count) {
                System.out.print((array[i] *= 2) + " ");
            } else {
                System.out.print((array[i]) + " ");
            }
        }

    }
}
