import java.util.Scanner;

public class GreedyVersion2 {
    public static void main(String[] args) {
        int[] nominals = {5, 10, 20, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете сума: ");
        double sum = scanner.nextDouble();

        sum *= 100;
        System.out.println("Сума в СТОТИНКИ: " + sum);

        int tCount = 0;
        int counter;
        int index = nominals.length - 1;

        while (sum > 0 && index >= 0) {
            int currentNominal = nominals[index];
            counter = 0;

            while (sum >= currentNominal) {
                sum -= currentNominal;
                counter++;
            }
            if (counter > 0) {
                tCount += counter;
                System.out.println("Използвани " + counter + " монети от " + currentNominal + " стотинки.");
            }
            index--;
        }

        System.out.println("Общ брой монети: " + tCount);
    }
}
