import java.util.Scanner;

public class PSU {
    public static void main(String[] args) {
        Scanner watts = new Scanner(System.in);
        System.out.println("TDP of CPU: ");
        int cpu = watts.nextInt();
        System.out.println("TDP of GPU: ");
        int gpu = watts.nextInt();
        System.out.println(cpu + gpu);
    }
}
