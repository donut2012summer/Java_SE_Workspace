package exercise;

public class HW02 {

    /* main */
    public static void main(String[] args){
        // 1.
        HW02.sumEven(1000);
        // 2.
        HW02.calProduct(10);
        // 3.
        HW02.calProduct2(10);
        // 4.
        HW02.printNumber();
        // 5.
        HW02.printLotteryNumber();
        // 6.
        HW02.printNumberTriangle();
        // 7.
        HW02.printAlphabet();
        // 8.
        HW02.printMultiplesOfFour();
        // 9.
        HW02.printOneToTen();
        // 10.
        HW02.printNine1();
        // 11.
        HW02.printNine2();
        // 12.
//        HW02.printNine3();

    }
    /*
    * 1. 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
    * @param number
    */
    public static void sumEven(final int number){

        int sum = 0;

        // from 1 to number
        for(int i = 1; i <= number; i++){

            // cal even
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.printf("1. 1~1000的偶數和為%d%n", sum);

    }

    /*
    * 2. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
    * @param number
    */
    public static void calProduct(final int number){

        int product = 1;
        String num = "";

        // product from 1 to number
        for(int i = 1; i <= 10; i++){
            product *= i;
        }

        System.out.printf("2. 1~10的連乘積為%d%n", product);
    }

    /*
    * 3. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
    * */
    public static void calProduct2(final int number){

        int i = 1;
        int product = 1;

        // product from 1 to number
        while(i <= 10){
            product *= i;
            i++;

        }

        System.out.printf("3. 1~10的連乘積為%d%n", product);
    }
    /*
    * 4. 請設計一隻Java程式,輸出結果為以下:
    * 1 4 9 16 25 36 49 64 81 100
    */
    public static void printNumber(){
        System.out.printf("4. ");

        for(int i = 1; i <= 10; i++){
           System.out.printf("%d ", (int)Math.pow(i, 2));
        }
        System.out.println();
    }
    /*
    * 5. 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
    *    請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
    */
    public static void printLotteryNumber(){

        // numbers met and print
        String num = "";

        // number to count
        int count = 0;

        // digits contains 4 -> i % 10 ==4
        // ten digits contains 4 -> i / 40 >= 1
        for(int i = 1; i<=49; i++){

            // skip the conditions which contains 4
            if(i % 10 == 4 || i / 40 >= 1) continue;
            //if(String.valueOf(i).contains("4")) continue;

            num = num + i + " ";
            count++;
        }

        System.out.printf("5. 阿文可以選擇的數字有%s, 總共有%d個%n", num, count);
    }
    /*
    * 6. 請設計一隻Java程式,輸出結果為以下:
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7 8
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    public static void printNumberTriangle(){

        // print vertically
        for(int i = 10; i > 0; i--){

            // print horizontally
            for(int j = 1; j <= i; j++){
                System.out.printf("%d ", j);
            }

            System.out.println();
        }
    }
    /*
    * 7. 請設計一隻Java程式,輸出結果為以下:
    A
    BB
    CCC
    DDDD
    EEEEE
    FFFFFF
    */
    public static void printAlphabet(){

        // print vertically 0 - 5 ( 6 times
        for(int i = 0; i < 6; i++){

            // print horizontally 0 - 5 ( 6 times
            for(int j = 0; j <= i; j++){

                // print String
                System.out.print((char)('A' + i));
            }

            System.out.println();
        }
    }

    /*
     * 8. 印出0~100中，四的倍數
     */
    public static void printMultiplesOfFour(){

        // print from 0 to 100
        for (int i = 0; i <= 100; i +=4){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
     * 9. print 1+...10 by three loop types
     */
    public static void printOneToTen(){

        int sum = 0;

        System.out.println("for loop");
        for(int i = 1; i<=10; i++){
            // calculate
            sum += i;

            // print 1+2+.... +
            System.out.print(i + "+ ");

            // print 10 = sum
            if(i == 10) {
                System.out.print(i + "= " + sum + "\n");
            }

        }

        System.out.println("while loop");
        sum = 0;
        int i = 1;

        while(i <= 10){
            // calculate
            sum += i;

            // print 1+2+3...
            System.out.print(i + "+ ");

            // print 10 = sum
            if(i == 10){
                System.out.print(i + "= " + sum + "\n");
            }

            i++;
        }

        System.out.println("do while loop");
        sum =0;
        int j = 1;

        do{
            // calculate
            sum += j;

            // print 1+2+3...+
            System.out.print(j + "+ ");

            // print 10 = sum
            if ( j == 10){
                System.out.print(j + "= " + sum + "\n");
            }

            j++;
        }while(j <= 10);

    }

    /*
     * 10. 九九乘法表 for+while
     */
    public static void printNine1(){

        // print vertically
        for(int i = 2; i <=9; i++){
            int j = 1;
            // print horizontally
            while(j <=9){
                // print i + j = ij
                System.out.printf("%d * %d = %2d \t", i, j, (i * j));
                j++;
            }
            System.out.println();
        }
    }

    /*
     * 11. 九九乘法表 for+do while
     */

    public static void printNine2(){

        // print vertically
        for(int i = 2; i <= 9; i++){

            int j = 1;

            // print horizontally
            do{

                // print i * j = ij
                System.out.printf("%d * %d = %2d \t", i, j, (i * j));
                j++;

            }while(j <= 9);
            System.out.println();
        }
    }

    /*
     * 12. 九九乘法表 while+do while
     * be careful of the 3 key elements of loop initial value; constraint; value change
     */
    public static void printNine3(){

        int i = 2;

        // print vertically
        while(i <= 9){

            int j = 1;

            // print horizontally
            do{
                // i * j = ij
                System.out.printf("%d * %d = %2d \t", i, j, (i * j));
                j++;

            }while(j <= 9);

            System.out.println();
            i++;
        }

    }

    /* end */

}
