public class FiboAgain {
    public static int fibo(int i) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        for(int j = 1; j < i;j++){
            sum = n1 + n2;  // Новото число е сумата на предишните две
            n1 = n2;        // Актуализираме n1
            n2 = sum;       // Актуализираме n2
        }
        return sum;
    }
}
