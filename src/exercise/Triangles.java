package exercise;

public class Triangles {


    public static void main(String[] args){
            printIsoscelesTriangle(5);
            printBlankTriangle(5);
    }


    /*
     * 請用java設計高度為7的星星等腰三角形
     * */
    public static void printIsoscelesTriangle(final int starLevel){

        for (int i=1; i<=starLevel;i++) {

            // print blank
            for( int j = starLevel-1; j >= i; j--) {
                System.out.print(" ");
            }

            // print star
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    /*
     * 請用java設計空心等腰三角形
     * */
    public static void printBlankTriangle(final int starLevel){
        for (int i=1;i<=5;i++) {
            for(int j=4;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if(k==1 || k==2*i-1 || i==5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
