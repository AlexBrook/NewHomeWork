package LearnClasses;

public class FractionNumbersMain {

    public static void main(String[]args){
        FractionNumbers f1 = new FractionNumbers(25,35);
        System.out.println(f1.toString());
        FractionNumbers f2 = new FractionNumbers(2, 7);
        FractionNumbers f3 = f1.add(f2);
        System.out.println("Result of addition of " + f1 + " and " + f2 + " is : " + f3);
        f3 = f1.subtract(f2);
        System.out.println("Result of subtraction of " + f1 + " and " + f2 + " is : " + f3);
        f3 = f1.divide(f2);
        System.out.println("Result of division of " + f1 + " and " + f2 + " is : " + f3);
        f3 = f1.multiply(f2);
        System.out.println("Result of multiplication of " + f1 + " and " + f2 + " is : " + f3);
    }
}
