import java.util.Scanner;

public class IdCardCheck {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        /*
        ЗАДАЧА: ПРОВЕРИ ЗА СЪМНИТЕЛНА ИНФОРМАЦИЯ
        check if age == bYear in while loop
         */
        System.out.println("Current year for check: ");
        short year = checker.nextShort();

        checker.nextLine();

        System.out.println("Enter your name: ");
        String name = checker.nextLine();

        while(true){
            System.out.println("Enter your age: ");
            short age = checker.nextShort();

            System.out.println("Enter your born year: ");
            short bYear = checker.nextShort();
            if(year - bYear == age){
                System.out.printf("Name: " + name + ", " + "Age: " + age + ", " + "Born Year: " + bYear);
                break;
            } else if(year - age == bYear){
                System.out.printf("Name: " + name + ", " + "Age: " + age + ", " + "Born Year: " + bYear);
                break;
            }
            else{
                System.out.println("INVALID ID");

            }
        }

    }
}
