public class Palidrome {
    public static boolean isPalindrome(Object num){
        boolean isPalindrome = true;
        String s = (String) num;
        int temp = s.length() -1;
        for(int i = 0;i < temp; i++){
            if(s.charAt(i) == s.charAt(temp)){
                temp--;
            }else{
                return false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        if(isPalindrome("12321")){
            System.out.println("True");
        }
    }
}
