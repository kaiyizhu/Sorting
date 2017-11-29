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
        StockInfo stock = (StockInfo) o;
        
        if(stock.date < date) {
            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
