import java.util.Objects;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Operation(+,-,*,/) ");
        String operation1 = scanner.next();
        if (Objects.equals(operation1, "+")) {
            System.out.println(num1 + num2);
        }
        else if (Objects.equals(operation1, "-")){
            System.out.println(num1 - num2);
        }
        else if (Objects.equals(operation1, "*")){
            System.out.println(num1 * num2);
        }
        else if (Objects.equals(operation1, "/")) {
            System.out.println(num1 / num2);
        }

    }
}
