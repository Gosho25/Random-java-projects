public class Discount {
    public static float discount(float price, float disc){
        return price * disc;
    }
 
    public static void main(String[] args) {
        float printing = discount(1500, 0.5f); 
        System.out.println((int)printing); 
    } 
}
