package accountinheritance;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwwallace
 */
public class Account {

    private int id = 0;
    private double balance= 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() {

            id = 0;
            balance = 0.0;
            annualInterestRate = 0.0;	
    }


    public Account(int newId, double newBalance) {
                    id = newId;
                    balance = newBalance;
            }
             Account(int newId, double newBalance, double newAnnualInterestRate) {
                    id = newId;
                    balance = newBalance;
                    annualInterestRate = newAnnualInterestRate;
            }

  
            public int getId() {
                    return id;
            }
            public double getBalance() {
                    return balance;
            }
            public double getAnnualInterestRate() {
                    return annualInterestRate;
            }
            public void setId(int newId) {
                    id = newId;
            }
            public void setBalance(double newBalance) {
                    balance = newBalance;
            }
            public static void setAnnualInterestRate(double newAnnualInterestRate) {
                    annualInterestRate = newAnnualInterestRate;
            }
   

    public Date getDateCreated() {

            return dateCreated;
            }
   
            double getMonthlyInterestRate() {
                    return annualInterestRate/12/100 * balance;
            }
    
            double withdraw(double amount) {
                    return balance -= amount;
            }	
   
            double deposit(double amount) {
                    return balance += amount;
            }
}
    



