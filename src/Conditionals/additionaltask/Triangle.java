package Conditionals.additionaltask;

public class Triangle {
    public static void main(String[]args){
        int sidea = 6;
        int sideb = 6;
        int sidec = 9;

        if(sidea == sideb || sidea == sidec || sideb == sidec){
            System.out.println("The triangle has two equal sides");

        }else{
            System.out.println("neravnobedrenniy");
        }
    }
}
