package BubbleSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Въведете N: ");

        int N = new Scanner(System.in).nextInt();

        int[] myArr = new Random().ints(N, 1, 100).toArray();

        System.out.println(Arrays.toString(myArr));

        Utils.BS_FF(myArr);

        System.out.println(Arrays.toString(myArr));


        //========================================



        myArr = new Random().ints(N, 1, 100).toArray();
        System.out.println(Arrays.toString(myArr));

        Utils.BS_WL(myArr);

        System.out.println(Arrays.toString(myArr));

    }
}
