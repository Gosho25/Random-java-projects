import java.util.Scanner;

public class ReallySimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().charAt(0);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res;
        if(op == '+'){
            res = n1 + n2;
        } else if(op == '-') {
            res = n1 - n2;
        }else if(op == '*'){
            res = n1 * n2;
        }else if(op == '/'){
            if(n2 == 0){
                System.out.pintln("ERROR");
            }else{
                res = n1 / n2;
            }
        }else{
            res = 0;
        }
        System.out.println(res);
    }
}
