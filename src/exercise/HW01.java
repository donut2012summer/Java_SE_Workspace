package exercise;

public class HW01 {

    /* main */
    public static void main(String[] args){
        // 1.
        HW01.sum(12, 6);
        // 2.
        HW01.calEggs(200);
        // 3.
        HW01.calSeconds(256_559);
        // 4.
        HW01.calCircle(5);
        // 5.
        HW01.calSavings(1_500_00, 20, 10);
        // 6. print and explain the result
        System.out.println("6. print and explain the result");
        // 5 + 5 = 10, integer sum up
        System.out.println("5 + 5 = " + (5 + 5));
        // 5 + '5' = 58, (int)'5' = 53
        System.out.println("5 + '5' = " + (5 + '5'));
        // 5 + "5" = 55, String concat
        System.out.println("5 + \"5\" = " + (5+"5"));
    }


    /*
    * 1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
    * @param numbers need to be calculated
    */
    public static void sum(final int num1, final int num2){

        System.out.printf("1. %d,%d這兩個數值的和為%d, 乘積為%d%n", num1, num2, (num1 + num2), (num1 * num2));
    }

    /*
    * 2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
    * @param number of eggs
    */
    public static void calEggs(final int eggs){
        final int EGGS_PER_BASKET = 12;
        System.out.printf("2. 雞蛋共有%d打%d顆%n", (eggs / EGGS_PER_BASKET), (eggs % EGGS_PER_BASKET));
    }

    /*
    * 3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    * @param seconds needs to be calculated
    */
    public static void calSeconds(final int totalSeconds){
        final int SECONDS_PER_MINUTE = 60;
        final int SECONDS_PER_HOUR = 60 * 60;
        final int SECONDS_PER_DAY = 60 * 60 * 24;

        // how many days
        int days = totalSeconds / SECONDS_PER_DAY;
        // how many hours
        int hours = (totalSeconds % SECONDS_PER_DAY) / SECONDS_PER_HOUR;
        // how many minutes
        int minutes = (totalSeconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        // how many seconds
        int seconds = totalSeconds % SECONDS_PER_MINUTE;

        System.out.printf("3. %d秒為%d天、%d小時、%d分與%d秒%n", totalSeconds, days, hours, minutes, seconds);
    }

    /*
    * 4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
    * @param radius of the circle
    */
    public static void calCircle(final int radius){
        final double PI = 3.1415;

        // circle area (radius * radius * PI
        double area = (radius * radius) * PI;

        // circumference (radius * 2 * PI
        double circumference = (radius * 2) * PI;

        // note the accuracy issue of the float/double in decimal, can use BigDecimal
        System.out.printf("4. 圓形面積為%.2f, 圓周長為%.2f%n", area, circumference);

    }

    /*
    * 5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
    * @param deposit, interest rate , years
    */
    public static void calSavings(final int deposit, final int interestRates, final int years ){
        // formula of compound interest
        // savings ＝ deposit ×（ 1 ＋ interestRates ）power of years 。

        // Interest per term in double, !careful with the cast
        final double INTEREST_RATE = (double)interestRates / 100;

        // savings
        // Math.pow return double, Math.pow(number,number of power)
        double savings = deposit * Math.pow( (1 + INTEREST_RATE) , years);

        System.out.printf("5. 本金%d, 年利率%d%%, 放%d年=> 本利和為%.4f%n", deposit, interestRates, years, savings);
    }

    /* end */
}
