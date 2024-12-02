import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Void {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> results = new ArrayList<>();  // Събиране на резултатите в списък

        while (true) {
            // Въвеждаме операцията
            char operation = scanner.nextLine().charAt(0);

            // Изход, ако се въведе 'e'
            if (operation == 'e') {
                break;
            }

            // Въвеждаме двете числа
            float num1 = Float.parseFloat(scanner.nextLine());
            float num2 = Float.parseFloat(scanner.nextLine());

            float result = 0;
            boolean validOperation = true;

            // Извършваме съответната операция
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
            }

            // Ако операцията е валидна, добавяме резултата към списъка
            if (validOperation) {
                results.add(result);
            }
        }

        // След като въведем 'e', извеждаме всички резултати
        for (float res : results) {
            System.out.println(res);
        }

        scanner.close();
    }
}
