package exercise;

/*
* 請設計一個Train類別,並包含以下屬性:
* - 班次 number,型別為int
* - 車種 type,型別為String
* - 出發地 start,型別為String
* - 目的地 dest,型別為String
* - 票價 price,型別為double
*
* - 設計對應的getter/setter方法
*
* */

import java.util.Objects;

public class Train implements Comparable<Train> {
    private int number;
    private String type;
    private String start;

    private String dest;
    private double price;

    public Train(final int number, final String type, final String start,
                 final String dest, final double price){
        this.number = number;
        this.type   = type;
        this.start  = start;
        this.dest   = dest;
        this.price  = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
    * Duplication definition based on Train number
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number;
    }

    /*
     * Duplication definition based on Train Number
     * */
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    /*
    * Sorted Definition based on Train Number Desc
    * */
    @Override
    public int compareTo(final Train train) {
        if (this.number > train.number) {
            return -1;
        }
        if (this.number == train.number) {
            return 0;
        }
        return 1;
    }

    /*
    * Print Train number, type
    * */

    @Override
    public String toString() {
        return String.format("%d%s[%s-%s]$%.0f", number, type, start, dest, price);
    }
    /* end */
}
