package exercise;

import java.util.Scanner;

public class HW05 {

    /* main */
    public static void main(String[] args){
        // 1.
//        Scanner scanner = new Scanner(System.in);
//
//        try{
//            // input width and height
//            System.out.println("please enter the width of the star square: ");
//            int width = scanner.nextInt();
//            System.out.println("please enter the height of the star square: ");
//            int height = scanner.nextInt();
//
//            starSquare(width, height);
//
//        }catch (final Exception e){
//            System.out.println("wrong input");
//        }finally {
//            scanner.close();
//        }
        // 2.
        randAvg();
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
        int sum = 0;
        for (int i = 0; i < randNumber.length; i++){
            sum += randNumber[i];
            System.out.print(randNumber[i] + " ");
        }
        System.out.println();

        // cal the average
        double average = (sum / randNumber.length);

        // print the 10 numbers and the average value
        System.out.println("average of the random numbers would be " + average);
    }

    /*
    * 3. 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
    *    可以找出二維陣列的最大值並回傳,如圖:
    * */
}
