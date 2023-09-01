package org.example;

public class SavingAccount extends BankAccount{

    private  double rate;
    private  double maximumWithdrawLimit;

    public SavingAccount(String name, double balance, double maximumWithdrawLimit) {
        super(name, balance, 0);
        this.rate = rate;
        this.maximumWithdrawLimit=maximumWithdrawLimit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaximumWithdrawLimit() {
        return maximumWithdrawLimit;
    }

    public void setMaximumWithdrawLimit(double maximumWithdrawLimit) {
        this.maximumWithdrawLimit = maximumWithdrawLimit;
    }

    public void withdraw(double amount) throws Exception{
        if(amount>maximumWithdrawLimit){
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        if(getBalance()-amount < getMinBalance()){
            throw  new Exception("Insufficient Balance");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }

    public double getSimpleInterest(int years) {
        return getBalance() + (getBalance() * rate * years);
    }

    public double getCompoundInterest(int times, int years) {
        return getBalance() * Math.pow(1 + rate / times, times * years);
    }
}
