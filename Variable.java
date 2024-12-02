import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= num*3;i++){
            sum += i;
        }
        System.out.println("fdifjidj: " + sum);
    }
}
