public class FromTo {
    public static void main(String[] args) {

        for(int i = 20;i <= 50; i++){
            if(i % 2 == 0) {
                continue;
            }else {
                System.out.println(i);
            }
        }


        /*
        4etni
        for(int i = 20; i <= 50; i += 2){
            System.out.println(i);
        }*/
    }
}