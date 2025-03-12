package QS;

import java.io.IOException;

public class QS_APP1 {
    public static void main(String[] args) throws IOException {
        QS_UTILITY utility = new QS_UTILITY();

        int[] myArr = utility.inputArray();//преместваме напълнения масив в нов масив

        System.out.println("Преди QS: ");
        utility.printArray(myArr);

        QS_UTILITY.quickSort(myArr, 0, myArr.length - 1 );//задаваме high и low за мисленото(виртуално) разделяне

        System.out.println("След QS: ");
        utility.printArray(myArr);
    }

}
