public class FindTrue {
    public static int countTrue(boolean[] list){
        int counter = 0;
        for(int detected = 0; detected < list.length;detected++){
            if(list[detected] == true){
                counter++;
            }
            else {
                continue;
            }
        }
        return counter;
    }
}



       /*
       Create a function which returns the number of true values there are in an array.

Examples
countTrue([true, false, false, true, false]) ➞ 2

countTrue([false, false, false, false]) ➞ 0

countTrue([]) ➞ 0

        */