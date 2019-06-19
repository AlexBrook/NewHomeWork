package Conditionals.additionaltask;

public class PercentageTask {
    public static void main(String[]args){
        float totalAmout = 999;
        float discount = totalAmout - (totalAmout*15)/100;

        if (totalAmout > 1000){
            System.out.printf("Your price with the discount is: %f",discount);
        }else{
            System.out.printf("Your sum is : %f",totalAmout);
        }
    }
}
