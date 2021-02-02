import java.sql.SQLOutput;

public class chbo {
    public static void main(String[] args){
         char myChar = 'D';
         char myUniCodeChar='\u0044';
        System.out.println(myChar);
        System.out.println(myUniCodeChar);
    char myCopyrightChar='\u00A9';
        System.out.println(myCopyrightChar);

        String myString = "This is a string";
        System.out.println("mystring is equal to" + myString);
        myString=myString + ", and this is more.";
        System.out.println("mystring is equal to" + myString);
        myString=myString + " \u00A9 2019";
        System.out.println("mystring is equal to" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);


        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("LastString is equal to" +lastString);


        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("it is not an alien ");
        int topScore = 100;
        if(topScore>= 100){
            System.out.println("you got high score");
        }
    }
}
