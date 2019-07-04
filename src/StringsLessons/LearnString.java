package StringsLessons;

public class LearnString {
    public static void main(String[]args){
       System.out.println (WordsInAString("The free-agent guard is part of the Nets' bold, two-part plan to acquire Irving and All-NBA forward Kevin Durant in free agency, league sources told ESPN. Irving plans to leave the Boston Celtics, whom he was traded to two years ago from the Cleveland Cavaliers, sources said. Irving is a native of South Orange, New Jersey, which is in the tri-state area."));
        System.out.println(CountLetter("Kyrie Irving"));
        System.out.println(CountWordLength("If Boston inks Walker, it will be interesting to see how Brad Stevens uses him. Walker ran about 56 pick-and-rolls per 100 possessions in Charlotte, according to Second Spectrum. Irving averaged about 36, and everyone whined about him hogging Boston's offense. How useful is Walker in a more democratic system?"));
        System.out.println(LetterRemoval("I'm alex and I live Java",'a','b'));
        RotateWord("Davids");
        System.out.println(ToUpperWord("The only place that i would rather be"));

        String text = " AX6BYU56UX6CV6BNT7NM-287430 ";
        String [] parts = text.split("-");
        String part1 = parts[0];
        String part2 = parts[1];


        boolean flag = part1.matches("%[a-zA-Z]%");
        boolean flag2 = part1.matches("\"[0-9]\"");


        if (flag ==  true && flag2 == true ){
            System.out.println("its a correct code");
        }else {
            System.out.println("please double check your code");
        }

        System.out.println(part1);
        System.out.println(flag);



    }
    public static int WordsInAString (String text){
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int CountLetter(String txt){
        char [] letters = txt.toCharArray();
        return letters.length;
    }

    public static int CountWordLength(String MyText){
        char [] words = MyText.toCharArray();
        return words.length;
    }

    public static String LetterRemoval(String texte, char letter1, char letter2){
        return texte.replace(letter1,letter2);

    }



    public static void RotateWord(String word){
        int len = word.length();
        StringBuffer sb = new StringBuffer(word);
        sb.append(word);

        for(int i = 0; i < len;i++){
            for(int j = 0; j!= len; j++){
                System.out.print(sb.charAt(i+j));
                System.out.print(" ");
            }



        }


    }

    public static char ToUpperWord(String word){
        String newWord = word.toLowerCase();
        return newWord.toUpperCase().charAt(0);


    }


}







