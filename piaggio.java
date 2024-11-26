public class piaggio {
    public static void main(String[] args) {
        int expense = 300;
        int kilometres = 365;
        float loadsTimes = (float) kilometres / (float) expense;
        float price = loadsTimes * 3.15f;
        System.out.println(price);
    }
}
