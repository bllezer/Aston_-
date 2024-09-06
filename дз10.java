public class дз10 {
    public static void flipBinaryArray(int[] args) {
    for (int i = 0; i < args.length; i++) {
        if (args[i] == 0) {
            args[i] = 1;
        } else {
            args[i] = 0;
        }
        System.out.print((args[i]) + " ");
    }
    }
}

