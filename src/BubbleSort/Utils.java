package BubbleSort;

public class Utils {
    public static void BS_FF(int[] myArr) { 
        for(int i = 0; i <= myArr.length-1; i++){
  
            for(int j = 0; j <= myArr[i]; j++){

            }

        }
    }

 


    //BS_WL
    public static void BS_WL(int[] myArr) {


        boolean swapped;


        do {
            swapped = false;
            for (int i = 0; i < myArr.length-1; i++) {

                //Започва от 0 и се увелиява
                int leftElement = myArr[i];

                //Десния елемент е с 1 позиция напред от левия
                int rightElement = myArr[i + 1];



                if (leftElement > rightElement) {
                    int current = leftElement;
                    leftElement = rightElement;
                    rightElement = current;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
