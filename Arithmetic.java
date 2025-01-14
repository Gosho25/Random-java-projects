public class Arithmetic {
    public int num1;//1
    public int num2;//2

    public Arithmetic(int num1, int num2){// 2 i 2
        this.num1 = num1;//this 1 = 2
        this.num2 = num2;  
    } 
    public void sum(){
        System.out.println(num1 + num2);
    }
    public void difference(){
        System.out.println(num1 - num2);
    }
    public void multiplication(){
        System.out.println(num1 * num2); 
    }
    public void division(){
        if(num2 == 0){
            System.out.println("Error, division by zero");
        }else{
            System.out.println(num1 / num2);
        }
    }
    
}

class Result{
    public static void main(String[] args) {
        Arithmetic result = new Arithmetic(2, 2);
        result.sum();
        result.difference();
        result.multiplication();
        result.division();
    }
}
