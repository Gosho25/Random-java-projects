public class OnlyOdd {
    public static void onlyOdd(int[] nums) {
        for(int i : nums){
            if(i % 2 == 0){// за четни числа, за нечетни != 0
                System.out.println(i);
            }
        }
    }
}
