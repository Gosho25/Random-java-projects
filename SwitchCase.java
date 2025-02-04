import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toFive = sc.nextInt();
        switch(toFive){
            case 1:
                System.out.println("Your number is 1");
                break;
            case 2:
                System.out.println("Your number is 2");
                break;
            case 3:
                System.out.println("Your number is 3");
                break;
            case 4:
                System.out.println("Your number is 4");
                break;
            case 5:
                System.out.println("Your number is 5");
                break;
            default:
                System.out.println("Your number is 0 or something else");
                break;
        }
    }
}
