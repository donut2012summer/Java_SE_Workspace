package learning;

import java.util.Scanner;

public class WordConverter {

    public static void main(String[] args){

        keyIn();

    }

    /*
    * Get user key In
    * */
    public static void keyIn(){

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.print("Please key in: ");

            String userInput = scanner.nextLine();

            String convertedString = convertWord(userInput);

            System.out.printf("Original \"%s\" Converted \"%s\"", userInput, convertedString);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }


    /*
    * seaFood > sea_food, meat > meat, myUSDMoney > my_usd_money
    * */
    public static String convertWord(String word){

        // 小寫大寫 ([a-z])([A-Z])
        String regex = "([a-z])([A-Z])";
        String replacedRegex = "$1_$2";

        // 大寫大寫小寫 （[A-Z]）([A-Z])([a-z])
        String regex2 = "([A-Z])([A-Z])([a-z])";
        String replacedRegex2 = "$1_$2$3";

        String resultString = word.replaceAll(regex, replacedRegex)
                                  .replaceAll(regex2, replacedRegex2)
                                  .toLowerCase();

        return resultString;
    }

    /* end */

}
