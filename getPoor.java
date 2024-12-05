import java.util.Objects;
import java.util.Scanner;

public class getPoor {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int user_score = 0;

        System.out.println("Use English alphabet");
        System.out.println("=====================");

        System.out.println("2 + 2 is equal to: ");
        System.out.println("A: 3");
        System.out.println("B: 4");
        System.out.println("C: 22");
        System.out.println("D: nigga");
        System.out.println("Your answer: ");
        String answ1 = answer.nextLine();
        if(Objects.equals(answ1, "B")){
            System.out.println("Nice");
            user_score += 1000;
        }
        else{
            System.out.println("WRONG");
            System.out.println("You can do better than this");
        }


        System.out.println(" \"JAVA is a : \"");
        System.out.println("A: programing language");
        System.out.println("B: cup with coffee");
        System.out.println("C: IDK");
        System.out.println("D: Minecraft");
        System.out.println("Your answer: ");
        String answ2 = answer.nextLine();
        if(Objects.equals(answ2, "A")){
            System.out.println("Lets goo");
            user_score += 1000;
        }
        else{
            System.out.println("WRONG");
            System.out.println("C'on you know this");
        }


        System.out.println(" \"Windows 10 is created in the year \"");
        System.out.println("A: 2016 by Microsoft");
        System.out.println("B: 2022 by Microsoft");
        System.out.println("C: 1789 by G. Washington");
        System.out.println("D: 2015 by Microsoft");
        System.out.println("Your answer: ");
        String answ3 = answer.nextLine();
        if(Objects.equals(answ3, "D")){
            System.out.println("WOW YOU CAN DO IT");
            user_score += 1000;
        }
        else{
            System.out.println("WRONG");
            System.out.println("- 1000 lv");
        }


        System.out.println(" \"Han Solo is a character from: \"");
        System.out.println("A: Marvel");
        System.out.println("B: 13th September");
        System.out.println("C: Super Mario");
        System.out.println("D: Star Wars");
        System.out.println("Your answer: ");
        String answ4 = answer.nextLine();
        if(Objects.equals(answ4, "D")){
            System.out.println("YOU WOOOON :)");
            user_score += 1000;
        }
        else{
            System.out.println("WRONG");
            System.out.println("Im sorry :( ");
        }

        System.out.println("Congratulations, you won"+" "+user_score+"lv");
    }
}
