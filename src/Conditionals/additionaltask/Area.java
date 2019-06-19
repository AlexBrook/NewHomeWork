package Conditionals.additionaltask;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {

        float squareArea = 20;
        float circleArea = 27;

        double diameter = 2 * Math.sqrt(circleArea / Math.PI);
        double sideOfSquare = squareArea / 4;
        double diagonal = sideOfSquare*Math.sqrt(2);

        if (diameter < sideOfSquare) {
            System.out.println("The circle will fit in to the square");

        }else {
            System.out.println("The circle won't fit into the square");
        }

        if(diagonal <= diameter){
            System.out.println("The square will fit into the square");
        }else{
            System.out.println("The square won't fit into the circle");
        }

    }

}
