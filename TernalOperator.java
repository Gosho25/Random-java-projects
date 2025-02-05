import java.util.Scanner;

public class TernalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = a > b || b == a ? "Bigger" : "Smaller";//1 is expr1 and 0 is expr2, a > b is condition
        System.out.println(result);//I use 1 and 0 like in C
    }
}
