import java.util.Scanner;

public class shit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        for(int i = 1;i <= 80;i++){
            System.out.println(i+"."+message);
        }
    }
}
