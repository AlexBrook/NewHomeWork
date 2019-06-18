package Conditionals;

public class Task3 {
    public static void main(String[]args){
        int number = 7;
        String wordNumber;

        switch (number){
            case 1:
                wordNumber = "One";
                System.out.println(wordNumber);
                break;
            case 2:
                wordNumber = "Two";
                System.out.println(wordNumber);
                break;
            case 3:
                wordNumber = "Three";
                System.out.println(wordNumber);
                break;
            case 4:
                wordNumber = "Four";
                System.out.println(wordNumber);
                break;
            case 5:
                wordNumber = "Five";
                System.out.println(wordNumber);
                break;
            case 6:
                wordNumber = "Six";
                System.out.println(wordNumber);
                break;
            case 7:
                wordNumber = "Seven";
                System.out.println(wordNumber);
                break;
            case 8:
                wordNumber = "Eight";
                System.out.println(wordNumber);
                break;
            case 9:
                wordNumber = "Nine";
                System.out.println(wordNumber);
                break;
                default:
                    System.out.println("Please entert a number between 1 and 9");
        }

        if(number == 1){
            wordNumber = "One";
            System.out.println(wordNumber);
        }else if(number == 2){
            wordNumber = "Two";
            System.out.println(wordNumber);
        }else if(number==3){
            wordNumber = "Three";
            System.out.println(wordNumber);
        }else if(number==4){
            wordNumber = "Four";
            System.out.println(wordNumber);
        }else if(number==5){
            wordNumber = "Five";
            System.out.println(wordNumber);
        }else if(number==6){
            wordNumber = "Six";
            System.out.println(wordNumber);
        }else if(number==7){
            wordNumber = "Seven";
            System.out.println(wordNumber);
        }else if(number==8){
            wordNumber = "Eight";
            System.out.println(wordNumber);
        }else if(number==9){
            wordNumber = "Nine";
            System.out.println(wordNumber);
        }else{
            System.out.println("Please enter a number from 1 to 9");
        }
    }
}
