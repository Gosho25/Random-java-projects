import java.util.Scanner;

public class me4os {
    public static void main(String[] args) {
        Scanner mecho = new Scanner(System.in);
        System.out.println("Meatballs: ");
        int meatballs = mecho.nextInt();
        System.out.println("Liter beer: ");
        int litersBeer = mecho.nextInt();
        if (meatballs+litersBeer == 15){
            System.out.println("Thats enough");
        }
        else {
            System.out.println("Mecho is still hungry");
        }
    }
}
