import java.util.Scanner;

public class NaPlamitoZada4ata {
    public static void main(String[] args) {
        int[] nominals = {5, 10, 20, 50};
        System.out.println("Моля въведете сума в левове: ");
        double amount = new Scanner(System.in).nextDouble();


        amount = amount * 100;
        System.out.println("Вашата сума в монети е " + amount);

        int totalCount = 0;
        int index = 0;
        int counter = 0;

        while (amount > 0) {
            int currentNominal = nominals[nominals.length - 1];
            counter = 0;

            while (amount >= currentNominal) {
                amount = amount - currentNominal;
                counter++;
            }
            if (counter > 0) {
                totalCount = totalCount + counter;
                System.out.println("Използвани монети(брой):  " + counter);
                System.out.println("Стойност на монетите: " + currentNominal);
            }
            index--;
        }
        System.out.println("==============================");
        System.out.println("Използвани монети(стойност): " + totalCount );
        System.out.println("==============================");

    }
}
