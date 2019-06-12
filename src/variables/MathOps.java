package variables;
import java.lang.Math;

public class MathOps {
    public static void main(String[]args){
        double x = 25.5;
        double result22 = Math.asin(Math.log(x)/(Math.pow(x,2)+ (5*x)+1)) - Math.pow(x,3.2)/28;
        System.out.println(result22);

        double x23 = 45;
        double result23 = Math.acos(Math.abs(Math.tan(5*x23/Math.PI))) + Math.pow(x23,5.7)/23;
        System.out.println(result23);

        double x26 = 23;
        double result26 = Math.log10(Math.abs(Math.sin(x26))) + (2 * Math.exp(x26)) + (2 * Math.cos(Math.abs(x26))+2);
        System.out.println(result26);

        double x17 = 453;
        double result17 = Math.pow(x17,3)/3 - Math.pow(Math.exp(x17),x17) * Math.log10(Math.abs(Math.pow(1.3,3)+Math.pow(x17,3))) + 4/3;
        System.out.println(result17);

        double x11 = 31;
        double result11 = (2* Math.PI* x11) - Math.abs(Math.sin(Math.sqrt(10.5*x11)))* 1/Math.cbrt(Math.pow(x11,2))+1/7;
        System.out.println(result11);

        double x19 = 12;
        double result19 = Math.acos(Math.abs(Math.tan(5*x19/Math.PI))) + Math.pow(x19,3.2)/28;
        System.out.println(result19);

        double x18 = 9;
        double result18 = Math.abs(7.2 - 10*x18)/Math.cbrt(Math.pow(x18,2)+Math.pow(Math.exp(x18),x18))*Math.atan(4*(x18/3)/Math.sqrt(Math.pow(1.1,3)+Math.pow(x18,2)));
        System.out.println(result18);


    }
}
