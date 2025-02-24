public class Factoriel {
    int num;

    public Factoriel(int num){
        this.num = num;
    }
    public void fact() {
        int result = 0;
        for(int i = 1; i <= num*2; i++){
            result += i;
        }
        System.out.println(result);
    }
}



class Pepi{
    public static void main(String[] args) {
        Factoriel factor = new Factoriel(3);
        factor.fact();

    }
}