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
        for(int y = 10; y > 0; y--){
            // print horizontally
            for(int x = 1; x <= y; x++){
                System.out.printf("%d ", x);
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

        // parse int char A into integer
        int alphabet = 'A';

        // print vertically
        for(int y = 1; y <= 5; y++){
            // print horizontally
            for(int x = 1; x <= y; x++){
                System.out.printf("%c", alphabet);
            }
            System.out.println();
            alphabet++;
        }
    }

    /* end */

}
