package QS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class QS_UTILITY {

    //МЕТОД ЗА ОБАВЯНЕ НА ЕЛЕМЕНТИ В МАСИВА
    public int[] inputArray() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Елементи в масива: ");
        int n = Integer.parseInt(bf.readLine());

        int[] myArr = new Random().ints(n, 1, 100).toArray();

        return myArr;
    }

    //МЕТОД ЗА ИЗВЕЖДАНЕ НА РЕЗУЛТАТ (ПРЕДИ И СЛЕД QS)
    public void printArray(int[] myArr){
        System.out.println(Arrays.toString(myArr));
    }


    // QUICK SORT МЕТОДИТЕ

    private static int partition(int[] myArr, int low, int high){
        int pivot = myArr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(myArr[j] < pivot){
                i++;
                swap(myArr, i, j);
            }
        }
        swap(myArr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] myArr, int i, int j){
        int swapped = myArr[i];
        myArr[i] = myArr[j];
        myArr[j] = swapped;
    }

    public static void quickSort(int[] myArr, int low, int high){
        if(low < high){
            int partIndex = partition(myArr, low, high);

            quickSort(myArr, low, partIndex - 1);//добър пример за пряка рекурсия
            quickSort(myArr, partIndex + 1, high);
        }
    }

}
