import java.util.Scanner;

public class SrednoAritm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i <= 5;i++){
            int userNum = sc.nextInt();
            sum += userNum;  
        }
        int result = sum / 5; 
        System.out.println(result);
        //upgrade from 5 to N(user's numbers)
        /*
        System.out.println("Write how many numbers you want to write: ");
        int lenght = sc.nextInt();
        int sum = 0;
        System.out.println();
        for(int i = 1;i <= lenght;i++){
            int userNum = sc.nextInt();
            sum += userNum;
        }
        int result = sum / lenght;
        System.out.println(result);
        */
    }
}
