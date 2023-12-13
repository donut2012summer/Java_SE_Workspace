package leetCode;

public class test {

    public static void main(String[] args) {
        int m = 5; // 设置方形的大小
        int n = 3; // 设置中心 "貨" 的大小，这里假设是 3 * 3

        printCustomSquarePattern(m, n);
    }

    private static void printCustomSquarePattern(int m, int n) {
        char centerChar = '貨';
        char fillChar = '掃';

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= (m - n) / 2 && i < (m + n) / 2 && j >= (m - n) / 2 && j < (m + n) / 2) {
                    System.out.print(centerChar);
                } else {
                    System.out.print(fillChar);
                }
            }
            System.out.println(); // 换行
        }
    }

}
