package org.example;

public class BankAccount {
    private String name;
    private  double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

   //methods
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        double remBal = this.balance - amount;

            if(remBal<minBalance){
                throw new Exception("Insufficient Balance");
            }
            else{
                balance = remBal;
            }


    }

    public String generateAccountNumber(int digits, int sum) throws Exception{

        int num = digits * 9;

            if(sum>num || digits<=0 || sum<0){
                throw new Exception("Account Number can not be generated");
            }

        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i!=digits){
            if(sum>=9){
                sb.append("9");
                sum = sum - 9;
            }
            else if(sum>0){
               sb.append(sum);
               sum=0;

            }
            else{
                sb.append(0);

            }
            i++;
        }
        return sb.toString();
    }
}
