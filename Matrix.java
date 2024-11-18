public class Matrix {
    public static void main(String[] args) {
        String[][] cars = new String[2][2];
        cars[0][0] = "VW";
        cars[0][1] = "BMW";
        cars[1][0] = "Opel";
        cars[1][1] = "Audi";

        for(int i = 0;i < cars.length;i++){
            System.out.println(i);
            for(int j = 0;j < cars[i].length;j++){
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}
