public class VKZ2 {
    public static void main(String[] args) {
        boolean V = false;
        boolean K = false;
        boolean Z = false;


        while (!(V && K && Z)) {


            if (!V) {
                System.out.println("Try to move V To The RIGHT !");
                if (K || Z) {
                    System.out.println("Can't move V to the RIGHT because K or Z is in the way!");
                } else {
                    V = true;
                    System.out.println("V has moved to the RIGHT!");
                }
            }


            if (!K) {
                K = true;
                System.out.println("Try to move K To The RIGHT !");
                if (V || Z) {
                    System.out.println("Can't move K to the RIGHT because V or Z is in the way!");
                } else {
                    K = true;
                    System.out.println("K has moved to the RIGHT!");
                }
            }


            if (!Z) {
                Z = true;
                System.out.println("Try to move Z To The RIGHT !");
                if (V || K) {
                    System.out.println("Can't move Z to the RIGHT because V or K is in the way!");
                } else {
                    Z = true;
                    System.out.println("Z has moved to the RIGHT!");
                }
            }

            System.out.println("Current Status:");
            System.out.println("V is on the RIGHT: " + V);
            System.out.println("K is on the RIGHT: " + K);
            System.out.println("Z is on the RIGHT: " + Z);

            System.out.println("----------------------------------------");
        }

        System.out.println("\nAll entities (V, K, Z) have successfully moved to the RIGHT!");
    }
}
