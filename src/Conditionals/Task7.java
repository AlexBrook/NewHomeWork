package Conditionals;
import java.lang.Math;

public class Task7 {
    public static void main(String[]args) {

        int a = 3;
        int b = -15;

        if(Math.abs(b) > a){
            System.out.printf("Number %d is bigger by its magnitude then %d",b,a);
        }else{
            System.out.println("What is the bigger number then?");
        }

    }

}
