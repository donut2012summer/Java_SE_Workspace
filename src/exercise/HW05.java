package exercise;

import java.util.Scanner;

public class HW05 {

    /* main */
    public static void main(String[] args){
        //1.
        Scanner scanner = new Scanner(System.in);

        try{
            // input width
            System.out.println("please enter the width of the star square: ");
            int width = scanner.nextInt();

            // input height
            System.out.println("please enter the height of the star square: ");
            int height = scanner.nextInt();

            starSquare(width, height);

        }catch (final Exception e){
            System.out.println("wrong input");
        }finally {
            scanner.close();
        }

        //2.
        randAvg();

        //3.
        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };

        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };

        System.out.println("max element of intArray " + maxElement(intArray));
        System.out.println("max element of doubleArray " + maxElement(doubleArray));

        //4.
        // 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
        MyRectangle myRectangle = new MyRectangle();
        myRectangle.setWidth(10);
        myRectangle.setDepth(20);
        System.out.println("4-1. area1 = " + myRectangle.getArea());

        // 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
        MyRectangle myRectangle1 = new MyRectangle(10, 20);
        System.out.println("4-2. area2 = " + myRectangle1.getArea());

        // 5.
        genAuthCode();

    }

    /*
    * 1. 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
    * */
    public static void starSquare(int width, int height){
        // print vertically
        for(int i = 1; i <= height; i++){

            // print horizontally
            for(int j = 1; j <= width; j++){
                System.out.print("x");
            }

            System.out.println();
        }

    }

    /*
    * 2. 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
    * */
    public static void randAvg(){

        // array for 10 random numbers
        int[] randNumber = new int[10];

        // generate 10 random numbers from 0 to 100 and put it in an array
        for (int i = 0; i < randNumber.length; i++){
            randNumber[i] = (int)(Math.random() * 101);
        }

        // get the average of the array
        System.out.println("10 random numbers as following: ");
        double sum = 0;
        for (int i = 0; i < randNumber.length; i++){
            sum += randNumber[i];
            System.out.print(randNumber[i] + " ");
        }
        System.out.println();

        // cal the average
        double average = (sum / (double)(randNumber.length));

        // print the 10 numbers and the average value
        System.out.println("average of the random numbers would be " + average);
    }

    /*
    * 3. 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
    *    可以找出二維陣列的最大值並回傳,如圖:
    *    @param int[][]
    * */
    public static int maxElement(int[][] x){

        // variable for the max value
        int maxEl = 0;

        // iterate the 2D array
        for (int[] array : x){
            for (int el : array ){
                if ( el > maxEl){
                    maxEl = el;
                }
            }
        }
        return maxEl;
    }
    /*
    * 3. Overloading maxElement()
    * @param double[][]
    * */
    public static double maxElement(double[][] x){
        // variable for the max element
        double maxEl = 0;

        // iterate the 2 D array
        for (double[] array : x){
            for (double el : array){
                if(el > maxEl){
                    maxEl = el;
                }
            }
        }
        return maxEl;
    }

    /*
    * 4. 請設計一個類別MyRectangle:
    * (1) 有兩個double型態的屬性為width, depth
    * (2) 有三個方法:
    * void setWidth(double width): 將收到的引數指定給width屬性
    * void setDepth(double depth): 將收到的引數指定給depth屬性
    * double getArea(): 能計算該長方形的面積
    * (3) 有兩個建構子:
    * public MyRectangle(): 不帶參數也無內容的建構子
    * public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
    *
    * */
    static class MyRectangle{
        // instance variables
        private double width;
        private double depth;

        // constructors
        public MyRectangle(){

        }
        public MyRectangle(double width, double depth){
            this.width = width;
            this.depth = depth;
        }
        void setWidth(double width){
            this.width = width;
        }
        void setDepth(double depth){
            this.depth = depth;
        }

        double getArea(){
            return (width * depth);
        }

    }

    /*
    * 5. 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
    * genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:
    * 驗證碼為: GLSe3X81
    *
    * */
    public static char[] genAuthCode(){

        // variable for store the verify codes
        char[] array = new char[8];

        //
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] alphabetsChar = alphabets.toCharArray();

        // iterate the char[] and put the verify codes based on the index
        for(int i = 0; i < array.length; i++){
            if ( i <= 3 || i == 5){
                // generate random number from 0 to 32 as the index of the alphabet
                int index = (int)(Math.random()*32);

                // assign the alphabet with random index to the array[i]
                array[i] = alphabetsChar[index];
            }else {
                // generate random number from 0 to 9 as the verified codes
                int randNum = (int)(Math.random()*10);
                // assign the random number to the array[i]
                array[i] = (char)(randNum + '0');
            }
        }

        // print result
        System.out.println("your verify code would be : ");
        for ( char i : array){
            System.out.print(i);
        }

        return array;

    }

    /* end */
}
