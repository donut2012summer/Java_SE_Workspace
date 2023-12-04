package exercise;

import java.math.BigInteger;
import java.util.*;

public class HW08 {

    /* main */
    public static void main(String[] args){

        // 1.
//        testCollection();

        // 2.
//        printTrainSet();

        // 3.
//        printTrainList();

        // 4.
//        printTrainTreeSet();

    }

    /*
     * 1. 請建立一個Collection物件並將以下資料加入:
     * Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
     * Object物件、“Snoopy”、BigInteger(“1000”)
     *
     * 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
     * 移除不是java.lang.Number相關的物件
     * 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
     * */
    public static void testCollection(){
        // There is duplicate numbers, hence use arraylist to store the objArr
        final ArrayList<Object> objArr = new ArrayList<>();

        // Auto wrap the primitive type data, remember to cast the type
        objArr.add(100);
        objArr.add(3.14);
        objArr.add(21L);
        objArr.add((short)100);
        objArr.add(5.1);
        objArr.add("kitty");
        objArr.add(100);
        objArr.add(new Object());
        objArr.add("snoopy");

        // Args for BigInteger is String
        objArr.add(new BigInteger("1000"));

        // Print via Iterator
        for (final Iterator<Object> iterator = objArr.iterator(); iterator.hasNext();){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        // Print via For Loop
        for ( int i = 0; i < objArr.size(); i++){
            System.out.print(objArr.get(i) + ", ");
        }
        System.out.println();

        // Print via For Each
        for (final Object obj : objArr){
            System.out.print(obj + ", ");
        }
        System.out.println();

        // @Note: if you use for each, then CopyOnWriteArrayList would be the option
        // Remove the object of java.lang.Number via iterator n print simultaneously
        for (final Iterator<Object> iterator = objArr.iterator(); iterator.hasNext();){
            final Object obj = iterator.next();

            if ( !(obj instanceof Number)){
                iterator.remove();
            }
        }
        System.out.println(objArr);

    }

    /*
    * Data from the Questions
    * */
    private static Train[] trains = new Train[7];
    static {
        trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
        trains[2] = new Train(118, "自強", "高雄", "台北", 500);
        trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
        trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
        trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
        trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
    }

    /*
    * 2. 請寫一隻程式,能印出不重複的Train物件
    * Override hashCode()及equals()
    * */
    public static void printTrainSet(){
        Set<Train> trainSet = new HashSet<>();

        // Put data in the trainSet
        for(Train train : trains){
            trainSet.add(train);
        }

        // Print by Iterator
        System.out.println("Print by Iterator");
        for ( final Iterator<Train> iterator = trainSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        // Print by for each
        System.out.println("Print by for each");
        for (final Train train : trainSet){
            System.out.println(train);
        }
    }

    /*
     * 3. 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
     * Override compareTo()
     * */
    public static void printTrainList(){

        List<Train> list = new ArrayList<>();

        // Add elements in the list
        for(final Train train : trains){
            list.add(train);
        }

        // Sort the list
        Collections.sort(list);

        // Print by Iterator
        System.out.println("print by Iterator");
        for(final Iterator<Train> iterator = list.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        // Print by for loop
        System.out.println("print by for loop");
        for ( int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // Print by for each loop
        System.out.println("print by for each");
        for(final Train train : list){
            System.out.println(train);
        }

    }

    /*
     * 4. 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
     * 覆寫 compareTo()且相等要回傳0
     * (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
     * */
    public static void printTrainTreeSet(){
        Set<Train> set = new TreeSet<>();

        // Add elements in the set
        for ( final Train train : trains){
            set.add(train);
        }

        // Print by Iterator
        System.out.println("Print by Iterator");
        for(final Iterator<Train> iterator = set.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        // Print by For each
        System.out.println("Print by for each");
        for(final Train train : set){
            System.out.println(train);
        }


    }

    /* end */

}
