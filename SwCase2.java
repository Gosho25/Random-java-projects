import java.util.Locale;
import java.util.Scanner;

public class SwCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine().toLowerCase();
        switch (message){
            case "hello":
                System.out.println("Hello, what's going on?");
                break;
            case "fuck":
                System.out.println("D. Gabrovska: +359 87 4545 6969");
                break;
            default:
                System.out.println("WoW interesting");
                break;
        }
    }
}
