package exercise;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW03 {

    /* main */
    public static void main(String[] args){

        // 1.
        evalTriangle();
        // 2.
        guessNumber();
        // 3.
        printLotteryNumber();
        // 4.
        printLotteryNumber2();
        // 5.
        printLotteryNumber3();
    }

    /*
    * 1. 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
    */
    public static void evalTriangle(){
        // open Scanner
        Scanner scanner = new Scanner(System.in);

        // topic
        System.out.println("請輸入三個整數:");

        try{
            int[] array = new int[3];

            for(int i = 0; i < array.length; i++){
                if(scanner.hasNextInt()){
                    array[i] = scanner.nextInt();
                }
            }

            // check the type of triangle

            // not a triangle => two sides sum <= the longest side
            Arrays.sort(array);

            if((array[0] + array[1]) <= array[2]){
                System.out.println("not a triangle");
                return;
            }

            // equilateral triangle => three sides are equal
            if( array[0] == array[1] && array[1] == array[2]){
                System.out.println("this is a equilateral triangle");
                return;
            }

            // right triangle => Pythagorean theorem a^2 + b^2 = c^2 ( c is the longest side of the triangle
            int[] power = new int[3];

            for( int i = 0; i < power.length; i++){
                power[i] = (int)Math.pow(array[i], 2);
            }

            if((power[0] + power[1]) == power[2]){
                System.out.println("this is a right triangle");
                return;
            }

            // Isosceles triangle => two sides equals
            if( array[0] == array[1] ||
                    array[1] == array[2] ||
                    array[2] == array[0])
            {
                System.out.println("this is a Isosceles triangle");
                return;
            }
            System.out.println("其他三角形");

        }catch ( final Exception e){
            // Exception for entering wrong number
            System.out.println("this is not an integer, we cannot check if it is triangle");
        }finally {
            // ! Scanner(System.in) is IO stream sources, need to be closed
//            scanner.close();
        }

    }

    /*
    * 2. 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
    * (提示:Scanner,亂數方法,無窮迴圈)
    * (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
    */
    public static void guessNumber(){
        // input a number ( Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("開始猜數字吧，猜不出來的話可以輸入-1結束遊戲");

        // generate random number 0 to 100 ( (int) Math.random() * (((Max - min)+1) + min) );
        int randomNo = (int)(Math.random() * 101);

        int guessNo = 0;

        try{
            while (true){
                if(scanner.hasNextInt()){
                    guessNo = scanner.nextInt();
                }

                if( guessNo == -1){
                    System.out.println("猜不出來沒關係啦 掰掰");
                    return;
                }
                // check if number meet the random number
                if( guessNo == randomNo ){
                    System.out.println("猜對了! 答案就是" + guessNo);
                    break;

                }else if (guessNo > randomNo){
                    System.out.println("猜錯了! 你的數字大於正確答案喔 嘿嘿");

                }else {
                    System.out.println("猜錯了! 你的數字小於正確答案喔 嘿嘿");
                }
            }
        }catch (final Exception e){
            System.out.println("input error");

        }finally {
            // ! Scanner(System.in) is a IO stream, need to be closed
//            scanner.close();
        }



    }

    /*
    * 3. 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
    * 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
    */
    public static void printLotteryNumber(){
        // topic
        System.out.println("阿文，請輸入你不喜歡的數字:");

        // input number which would not show in the lottery number ( 1 to 9
        Scanner scanner = new Scanner(System.in);

        // store input number and count number
        int number = 0;
        int count = 0;

        try{
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }

            // iterate 1 to 49
            for(int i = 1; i <= 49; i++){

                // compare to the input number and remove one included
                if(String.valueOf(i).contains(String.valueOf(number))){
                    continue;
                }

                // print the number
                System.out.print(i + " ");

                // calculate the available number
                count++;
            }

            System.out.println("共有" + count + "個數字可以選擇");

        }catch (final Exception e){

        }finally {
//            scanner.close();
        }
    }

    /*
    * 4. continue to Q3, use collection
    * (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
    * */
    public static void printLotteryNumber2(){
        // topic
        System.out.println("1. 阿文，請輸入你不喜歡的數字:");

        // input number which would not show in the lottery number ( 1 to 9
        Scanner scanner = new Scanner(System.in);

        // store the input number
        int number = 0;

        // store the random numbers
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        try{
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }

            if(number < 1 || number > 9){
                System.out.println("wrong number!");
                return;
            }

            while(true){
                // generate random number ( 1 to 49
                int randomNumber = (int)((Math.random() * 49) + 1);

                // exclude the number contains input number
                if(String.valueOf(randomNumber).contains(String.valueOf(number))){
                    continue;
                }

                // limit the number of the arraylist
                if(arrayList.size() == 6){
                    break;
                }

                // add number into the arraylist
                arrayList.add(randomNumber);

            }

            // print available numbers
            System.out.println("以下為推薦的號碼:");

            for(int i = 0; i < arrayList.size(); i++){
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();

        }catch (final Exception e){
            System.out.println("input error");
        }finally {
//            scanner.close();
        }
    }

    /*
    * 5. continue to Q4, use pure array
    * */
    public static void printLotteryNumber3(){
        // topic
        System.out.println("2. 阿文，請輸入你不喜歡的數字:");

        // input number which would not show in the lottery number ( 1 to 9
        Scanner scanner = new Scanner(System.in);

        // store the input number
        int number = 0;

        // store count
        int count = 0;

        try{
            // input a number
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }

            // iterate 49 numbers compare to the input number n count
            for(int i = 1; i <= 49; i++){
                if(String.valueOf(i).contains(String.valueOf(number))) {
                    continue;
                }
                count++;
            }

            // create the new array using the available number counts
            int[] availableNumbers = new int[count];

            // iterate the numbers again the put the available number in the array
            for(int i = 1; i <= 49; i++){
                if(String.valueOf(i).contains(String.valueOf(number))) {
                    continue;
                }
                availableNumbers[--count] = i;
            }

            // mess up the available numbers
            for(int i = 0; i < availableNumbers.length; i++) {
                // get random number from 0 to availableNumbers.length as index
                int random = (int)(Math.random() * availableNumbers.length);

                // preserve the random number
                int tmp = availableNumbers[random];

                // mess up => change the value between index i and index r
                availableNumbers[random] = availableNumbers[i];
                availableNumbers[i] = tmp;

            }

            // access the first 6 numbers
            System.out.println("推薦的數字為:");
            for(int i = 0; i < 6; i++) {
                System.out.print(availableNumbers[i] + " ");
            }
        }catch (final Exception e){
            System.out.println("input error");

        }finally {
//            scanner.close();
        }
    }

    /* end */
}
