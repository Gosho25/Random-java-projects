import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Num2: ");
        int num2 = scanner.nextInt();
        if (num2 != 0){
            System.out.println(num1 / num2);
        }
        else if (num2 == 0) {
            System.out.println("Error,devision by zero");
        }
    }
}

