package exercise;

public class ClassTest1 {

    /*
    * main
    */
    public static void main(String[] args){
        ClassTest1 classTest1 = new ClassTest1();

//        classTest1.printMultiplesOfFour();
//        classTest1.printOneToTen();
//        classTest1.nineNieList();
        classTest1.printStarsTriangle();
    }

    /*
    * 印出0~100中，四的倍數
    * i = 1; i <= 100;
    * i % 4 == 0; print
    * */
    public void printMultiplesOfFour(){

        int flag =0;
        for (int i=4; i<=100; i+=4){

            if(i != 100){
                System.out.printf(" %d, ", i);
                flag++;

            }else {
                System.out.printf(" %d%n", i);
                flag++;

            }

        }
        System.out.printf("共 %d 個數字%n", flag);

    }

    /*
    * print 1+...10 by three loop types
    */
    public void printOneToTen(){
        int i =0, sum = 0;

        /* for loop
         * i = 1
         * i <= 10
         * i ++
         */
        System.out.println("For Loop");
        for(i=1; i<=10; i++){
            sum+=i;
            if(i<10){
                System.out.printf("%d + ",i);
            }else {
                System.out.printf("%d = %d%n",i, sum);
            }

        }

        /*
         * while loop
         * i = 0
         * i < 10
         * i ++
         */

        i=0;
        sum=0;
        System.out.println("While Loop");
        while(i < 10){
            i++;
            sum+=i;
            if(i<10){
                System.out.printf("%d + ",i);
            }else {
                System.out.printf("%d = %d%n",i, sum);
            }
        }

        /*
         * do while loop
         * i = 0
         * i < 10
         * i ++
         */

        i = 0;
        sum = 0;
        System.out.println("Do-while Loop");
        do{
            i++;
            sum+=i;
            if(i < 10){
                System.out.printf("%d + ", i);

            }else {
                System.out.printf("%d = %d", i, sum);

            }
        }while(i < 10);


    }

    /*
    * 巢狀迴圈：九九乘法表
    * i = 2; i <= 9; i++
    * j = 1; j <= 9; j++
    *
    */
    public void nineNieList(){

        int sum;
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                sum=i*j;

                if(j != 9){
                    System.out.printf("%d * %d = %2d, ",i,j,sum);
                }else {
                    System.out.printf("%d * %d = %2d%n",i,j,sum);
                }

            }
        }

    }

    /*
    * 巢狀迴圈：正三角形星星
    * i = 1; i <= 5; i++
    * j = 1; j <= i; j++
    * */
    public void printStarsTriangle(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    /*
    *
    * */

}
