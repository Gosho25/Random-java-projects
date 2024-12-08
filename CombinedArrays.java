public class CombinedArrays {
    public static int[] alternate(int[] a1, int[] a2) {
        int[] combined = new int[a1.length + a1.length];
        int j = 0;
        for(int i = 0;i < a1.length; i++){//a1 защото ТРЯБВА да са с 1 дължина и за да ги комбинираме
            combined[j++] = a1[i];
            combined[j++] = a2[i];
        }
        return combined;
    }
}
