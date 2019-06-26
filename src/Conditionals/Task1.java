package Conditionals;

public class Task1 {
    public static void main (String[]args){

        int mark = 74;

        if(mark >= 50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        System.out.println("DONE");

        // task 1

        boolean bonus = true;
        int salary = 10000;

        if(bonus == true){

            System.out.println(salary*10);

        }else if(bonus == false){
            System.out.println(salary);
        }

        //task2
        int falseNumber = -7;

        if(falseNumber == falseNumber * -1){
            System.out.println("You have got a negative number man");
        }else if(falseNumber != falseNumber){
            System.out.println(falseNumber*-1);
        }

        //task5

        int humanYears = 4;


        if(humanYears == 1){
            int catYears = 15;
            int dogYears = 15;
            System.out.println(catYears);
            System.out.println(dogYears);
        }else if(humanYears == 2){
            int catYears = 15;
            int dogYears = 15;
           int catYears1 = catYears +  9;
           int dogYears1 = dogYears + 9;
        }else if(humanYears == 3) {
            int catYears = 15 + 9;
            int dogYears = 15 + 9;
            int catYears1 = catYears + 4;
            int dogYears1 = dogYears + 5;
            System.out.println(catYears1);
            System.out.println(dogYears1);
            System.out.println(humanYears);
        }else if(humanYears == 4){
            int catYears = 15 + 9+4;
            int dogYears = 15 + 9 + 5;
            int catYears1 = catYears + 4;
            int dogYears1 = dogYears + 5;
            System.out.println(catYears1);
            System.out.println(dogYears1);
            System.out.println(humanYears);
        }

        //task4
        char plus = '+';
        char minus = '-';
        char multiple = '*';
        char division = '/';
        int number1 = 12;
        int number2 = 11;

        if(plus == '+'){
            System.out.println(number1+number2);
        }else if(minus=='-'){
            System.out.println(number1-number2);
        }else if(division == '/'){
            System.out.println(number1/number2);
        }else if(multiple=='*'){

        }



    }




}
