Banking------->

A bank account can be used by various individuals or organizations for various reasons. Some different types of bank accounts are Savings account, Current account, Student account, etc..

Consider the following classes which implement the above mentioned system:

BankAccount: contains name, balance, and minimum balance.

a. deposit(double amount): Deposit an amount to the account.
b. withdraw(double amount): Withdraw an amount from the account. 
Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
c. generateAccountNumber(int digits, int sum): Each digit of an account number can lie between 0 and 9 (both inclusive). 
Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'.
If it is not possible, throw "Account Number can not be generated" exception

CurrentAccount: CurrentAccount extends BankAccount.
A current account also contains a tradeLicenseId (consisting of Uppercase English characters only). 
The minimum balance required to open a current account is 5000 by default.

a. validateLicenseId(): A trade license Id is said to be valid if no two consecutive characters are same.
If the license Id is valid, do nothing, else rearrange the characters of the license Id to create any valid license Id.
If it is not possible, throw "Valid License can not be generated" Exception

SavingsAccount: SavingsAccount extends BankAccount. 
It contains rate (for interest) and maximum withdrawal limit. 
The minimum balance required to open a current account is 0 by default.

a. withdraw(double amount): Might throw the following errors:

- "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
- "Insufficient Balance" : If the amount exceeds balance
  b. getSimpleInterest(int years): Return the final amount considering that bank gives simple interest on current amount. 
- b. getCompoundInterest(int times, int years): Return the final amount considering that bank gives compound interest on current amount given times per year.

StudentAccount: StudentAccount extends BankAccount.
It contains the institution name. 
The minimum balance required to open a current account is 0 by default.

Complete the code of the above mentioned functions. 
Note that you must not change the names of any existing class or method.