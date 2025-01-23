import java.util.Scanner;

public class AgeTill120 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); 

        int till120 = 100 - age;  
        System.out.println(till120);
    }
} 
