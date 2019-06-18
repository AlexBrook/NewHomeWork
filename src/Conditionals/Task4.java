package Conditionals;

public class Task4 {
    public static void main(String[]args){
        int day = 6;
        String dayString;

        switch(day){
            case 1 :
                dayString = "Sunday";
            System.out.println(dayString);
            break;
            case 2:
                dayString = "Monday";
                System.out.println(dayString);
                break;
            case 3:
                dayString = "Tuesday";
                System.out.println(dayString);
                break;
            case 4:
                dayString = "Wednesday";
                System.out.println(dayString);
                break;
            case 5:
                dayString = "Thursday";
                System.out.println(dayString);
                break;
            case 6:
                dayString = "Friday";
                System.out.println(dayString);
                break;
            case 7:
                dayString = "Saturday";
                System.out.println(dayString);
                break;
                default:
                    System.out.println("Please enter a number between 1 to 7");
        }

        if(day == 1){
            dayString = "Sunday";
            System.out.println(dayString);
        }else if(day == 2){
            dayString = "Monday";
            System.out.println(dayString);
        }else if(day==3){
            dayString = "Tuesday";
            System.out.println(dayString);
        }else if(day==4){
            dayString = "Wedensday";
            System.out.println(dayString);
        }else if(day==5){
            dayString = "Thursday";
            System.out.println(day);
        }else if(day==6){
            dayString = "Friday";
            System.out.println(dayString);
        }else if(day==7){
            dayString = "Saturday";
        }else{
            System.out.println("Please enter a number between 1 and 9");
        }
    }
}
