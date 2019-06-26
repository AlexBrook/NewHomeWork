package JavaMethods;
import java.lang.Math;

public class SquareEqa {
    public static void main(String[]args) {

        SquareEquation(23,24,5);


    }

    public static void SquareEquation(double a,double b, double c) {
        double D = b * b - 4 * a * c;
            double x1,x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);





    }

}
