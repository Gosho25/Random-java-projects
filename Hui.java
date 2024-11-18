public class Hui {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "VW";
        cars[0][1] = "BMW";
        cars[1][0] = "Audi";
        cars[1][1] = "Opel";
        cars[0][2] = "Kia";
        cars[1][2] = "Mercedes";
        cars[0][2] = "IFA";
        cars[2][1] = "Skoda";
        cars[2][2] = "Tesla";

        for(int i = 0;i <cars.length;i++){
            System.out.println(i);
            for(int j = 0;j<cars[i].length;j++){
                System.out.println(cars[i][j]);
            }
        }
    }
}