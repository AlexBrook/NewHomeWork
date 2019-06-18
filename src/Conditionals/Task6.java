package Conditionals;

public class Task6 {
    public static void main(String[]args){
        int a = 5;
        int b = 25;
        int x = -b/a;

        if(a == 0){
            throw new ArithmeticException("Divison by zero is impossible");
        }else if(b == 0){
            System.out.printf("The x is equal to %d",x);
        }else{
            System.out.println(x);
        }





    }
}
