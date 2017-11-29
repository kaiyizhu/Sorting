/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

/**
 *
 * @author 072935638
 */
public class StockInfo implements Comparable {
    char d = ',';

    double price, date, dividend, earnings, CPI, interestRate, PERatio;

    public StockInfo(double price, double date, double dividend, double earnings, double CPI, double interestRate, double PERatio) {
        this.price = price;
        this.date = date;
        this.dividend = dividend;
        this.earnings = earnings;
        this.CPI = CPI;
        this.interestRate = interestRate;
        this.PERatio = PERatio;
    }

    public StockInfo(double[] set) {
        this.price = set[0];
        this.date = set[1];
        this.dividend = set[2];
        this.earnings = set[3];
        this.CPI = set[4];
        this.interestRate = set[5];
        this.PERatio = set[6];
    }

    public int compareTo(Object o) {
        //Force Object into StockInfo object
        StockInfo stock = (StockInfo) o;

        //If the dates are equal, then return 0
        if (this.date == stock.date) {
            return 0;
        } else if (this.date < stock.date) {//If this date is less than the compared date, then return -1
            return -1;
        } else {//If this date is greater than the compared date, then return 1
            return 1;
        }
    }

    public String toString() {
        return "" + price + d + date + d + dividend + d + earnings + d + CPI + d  + interestRate + d + PERatio;
    }
}
