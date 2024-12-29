import java.util.Objects;
import java.util.Scanner;

public class FixedAdvancedCalc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter operation: ");
            String operation = sc.nextLine();
            if(Objects.equals(operation, "e")) {
                break;
            }


            System.out.println("Num1: ");
            float num1 = sc.nextFloat();

            sc.nextLine();

            System.out.println("Num2: ");
            float num2 = sc.nextFloat();

            sc.nextLine();

            if(Objects.equals(operation, "+")) {
                System.out.println(num1 + num2);
            } else if(Objects.equals(operation, "-")) {
                System.out.println(num1 - num2);
            } else if(Objects.equals(operation, "*")) {
                System.out.println(num1 * num2);
            } else if(Objects.equals(operation, "/")) {
                System.out.println(num1 / num2);
            }
        }
        sc.close();
    }
}
