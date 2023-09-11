package exercise;


import java.util.Scanner;

public class HW04 {

    /* main */

    public static void main(String[] args){
        // 1.
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        calArray(array);
        // 2.
        String sentence = "Hello World";
        reverseStrings(sentence);
        // 3. 
        String[] words = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        calSentence(words);
        // 4.
        moneyAvailableToLoan();
        // 5.
        evalDaysOfYear();
        // 6.
        calHighestScore1();
        calHighestScore2();
    }

    /*
    * 1. 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
    * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
    * (提示:陣列,length屬性)
    * @param int[]
    */

    public static void calArray(final int[] array){
        // cal and print the average of the array

        // store the sum value
        int sum = 0;

        // iterate the array and sum up
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        // cal the average and print
        int average = (sum / array.length);
        System.out.println("the average of the array would be " + average);

        // iterate the array n print the elements bigger than the average number
        System.out.print("elements which bigger than the average would be :");
        for (int i : array){
            if(i > average){
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }

    /*
    * 2. 請建立一個字串,經過程式執行後,輸入結果是反過來的
    * 例如String s = "Hello World",執行結果即為dlroW olleH
    * (提示:String方法,陣列)
    * @param string
    * */

    public static void reverseStrings(String sentence){

        // print the array reverse from the end
        for(int i = (sentence.length()-1); i >= 0 ; i--){
            System.out.print(sentence.charAt(i));
        }

        System.out.println();
    }

    /*
     * 2. 請建立一個字串,經過程式執行後,輸入結果是反過來的，並且大小寫不同
     * 例如String s = "Hello World",執行結果即為dlroW olleH
     * (提示:String方法,陣列)
     * @param string
     * */
    public static void printReverse(final String sentence){
        // Convert String to char array
        char[] arr = sentence.toCharArray();

        // iterate array and convert to reversed case
        for( int i  = arr.length-1; i >= 0; i--){
            // Store element for checking case
            char el = arr[i];

            if (Character.isLowerCase(el)){
                // Convert the case and assigned to array[i]
                arr[i] = Character.toUpperCase(el);

            } else {
                arr[i] = Character.toLowerCase(el);
            }
            // Print the element
            System.out.print(arr[i]);
        }
    }


    /*
    * 3. 有個字串陣列如下 (八大行星):
    * {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
    * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
    * (提示:字元比對,String方法)
    * @param String[]
    * */
    public static void calSentence(String[] words){

        int count = 0;

        // iterate the String array
        for( String word : words){

            // parse each String to char array
            char[] wordToChar = word.toCharArray();

            // compare the char array with the keywords and counts
            for( char i : wordToChar){

                // compare
                if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                    count++;
                }
            }
        }
        // print result
        System.out.println("total number of vowel letters would be: " + count);
    }

    /*
    * 4. 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
    * 員工編號 {25, 32, 8, 19, 27}
    * 身上現金 {2500, 800, 500, 1000, 1200}
    * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
    * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
    * 員工編號: 25 19 27 共 3 人!」
    * (提示:Scanner,二維陣列)
    *
    * */

    public static void moneyAvailableToLoan(){
        Scanner scanner = new Scanner(System.in);

        // raw data
        final int[][] colleaguesData = {
                {25, 32, 8, 19, 27},
                {2500, 800, 500, 1000, 1200}
        };

        // topic
        System.out.println("Hi, how much money do you need?");

        // variables
        int amount = 0;
        int count = 0;

        // StringBuilder for printing
        StringBuilder stringBuilder = new StringBuilder("you can lend from employee number: ");

        try{
            // input the amount
            if(scanner.hasNextInt()){
                amount = scanner.nextInt();
            }

            // constraint
            if(amount < 0){
                System.out.println("amount should be more than 0!");
                return;
            }

            if(amount > 2500){
                System.out.println("sorry, no one had enough money to lend");
                return;
            }

            // iterate the colleagueData[1] and check which amount meet required amount
            for (int i = 0; i < colleaguesData[1].length; i++){
                if(amount <= colleaguesData[1][i]){

                    // count the available employees
                    count++;

                    // append the employee number for printing
                    stringBuilder.append(colleaguesData[0][i]).append(" ");

                }
            }

            // print final result //員工編號: 共  人!
            System.out.println(stringBuilder + "total " + count + " persons");

        }catch (final Exception e){
            System.out.println("input error");

        }

    }

    /*
    * 5. 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是"該年的第幾天"
    * 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
    * (提示1:Scanner,陣列)
    * (提示2:需將閏年條件加入)
    * (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
    * */

    public static void evalDaysOfYear(){
        // 1. Scanner for input
        Scanner scanner = new Scanner(System.in);

        try{

            // 2. Constraints
            System.out.println("please enter the year: ");
            int year = scanner.nextInt();

            // constraint for year => year > 0
            if(year < 0 ){
                System.out.println("Please enter the number > 0, for days after vid");
                return;
            }

            System.out.println("please enter the month: ");
            int month = scanner.nextInt();

            // constraint for month => 0 < month < 12
            if(month <= 0 || month > 12){
                System.out.println("month should be chose between 1 to 12!");
                return;
            }

            // the days data
            final int[] DAYS_PER_MONTH = {
                    31, 28, 31,
                    30, 31, 30,
                    31, 31, 30,
                    31, 30, 31
            };


            System.out.println("please enter the day: ");
            int day = scanner.nextInt();

            // constraint for day => compare to the DAYS_PER_MONTH array
            if(day > DAYS_PER_MONTH[(month-1)] || day < 0){
                System.out.println("day should not be 0 or larger than it's belonging month!");
                return;
            }

            // 3. cal the day
            int sum = 0;
            for(int i = 0; i < (month-1); i++){
                sum += DAYS_PER_MONTH[i];
            }
            sum += day;

            if(month == 1){
                System.out.printf("輸入的日期為該年第%d天", sum);
                return;
            }

            // 4. define the output based on the leap year
            if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
                System.out.printf("輸入的日期為該年第%d天%n", (sum+1));

            }else {
                System.out.printf("輸入的日期為該年第%d天%n", sum);
            }


        }catch (final Exception e){
            System.out.println("wrong input");
        }

    }

    /*
    * 6. 班上有8位同學,他們進行了6次考試結果如下:
    *    請算出每位同學考最高分的次數
    * */

    public static void calHighestScore1(){

        // data for scores
        final int[][] scoresData = {
                { 10, 35, 40, 100, 90, 85, 75, 70 },// test 1
                { 37, 75, 77, 89, 64, 75, 70, 95 },	// test 2
                { 100, 70, 79, 90, 75, 70, 79, 90 },// test 3
                { 77, 95, 70, 89, 60, 75, 85, 89 },	// test 4
                { 98, 70, 89, 90, 75, 90, 89, 90 },	// test 5
                { 90, 80, 100, 75, 50, 20, 99, 75 },// test 6
        };

        // array for counting the maxScore
        int[] scoreCount = new int[8];

        // iterate each array and find the highest
        // keep the highest score in the highestScore and compare with the next
        for(int i = 0; i < scoresData.length; i++){

            int index = 0;
            int highestScore = 0;

            // iterate scores in each 1 D array
            for(int j = 0; j < scoresData[i].length; j++){

                // comparing each element with the highestScore
                // if score > highestScore, then replaced it, and assign its index to index
                if(scoresData[i][j] > highestScore){
                    highestScore = scoresData[i][j];
                    index = j;
                }
            }
            // count the index of highest level in the scoreCount array
            scoreCount[index] += 1;
        }

        // print the score count of each student number (the index +1
        System.out.println("各位同學考最高分的次數如下: ");
        for(int i = 0; i < scoreCount.length; i++){
            System.out.printf("%d 號: %d 次%n", (i+1), scoreCount[i]);
        }

    }

    /*
    * 6. other solution of Q6
    * */
    public static void calHighestScore2(){
        // data for scores
        final int[][] scoresData = {
                { 10, 35, 40, 100, 90, 85, 75, 70 },// test 1
                { 37, 75, 77, 89, 64, 75, 70, 95 },	// test 2
                { 100, 70, 79, 90, 75, 70, 79, 90 },// test 3
                { 77, 95, 70, 89, 60, 75, 85, 89 },	// test 4
                { 98, 70, 89, 90, 75, 90, 89, 90 },	// test 5
                { 90, 80, 100, 75, 50, 20, 99, 75 },// test 6
        };

        // array for count the max score of each student
        int[] arrayCount = new int[8];

        // iterate each 1 D array (test) and find the Max score
        for(int i = 0; i < scoresData.length; i++){

            // get the max score of scoreData[i]
            int maxScore = getMaxScore(scoresData[i]);

            // get the index of the max score in the array
            for(int j = 0; j < scoresData[i].length; j++){
                if(scoresData[i][j] == maxScore){
                    arrayCount[j]++;
                }
            }

        }

        // print the score count of each student number (the index +1
        System.out.println("各位同學考最高分的次數如下: ");
        for(int i = 0; i < arrayCount.length; i++){
            System.out.printf("%d 號: %d 次%n", (i+1), arrayCount[i]);
        }


    }

    /*
    * method for Q 6 to get Max score in an array
    * @param in[]
    * */
    public static int getMaxScore(int[] array){

        int maxScore = 0;
        for(int i : array){
            if(i > maxScore){
                maxScore = i;
            }
        }
        return maxScore;

    }

    /* end */


}

