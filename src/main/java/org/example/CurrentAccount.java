package org.example;

public class CurrentAccount extends BankAccount{
    private String tradeLicenseId;

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void setTradeLicenseId(String tradeLicenseId) {
        this.tradeLicenseId = tradeLicenseId;
    }

    public CurrentAccount(String name, double amount, String tradeLicenseId) {
        super(name, amount, 5000);

        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception{

        if(this.tradeLicenseId.isEmpty()){
            throw new Exception("Valid License can not be generated");
        }

        StringBuilder newLicenseId = new StringBuilder();

        for (int i = 1; i < tradeLicenseId.length(); i++) {
            if (tradeLicenseId.charAt(i) == tradeLicenseId.charAt(i - 1)) {
                newLicenseId.append(getDifferentChar(newLicenseId.charAt(i - 1)));
            }
            else {
                newLicenseId.append(tradeLicenseId.charAt(i));
            }
        }

        tradeLicenseId = newLicenseId.toString();

    }

    private char getDifferentChar(char ch) {
        for (char c = 'A'; c <= 'Z'; c++) {
            if (c != ch) {
                return c;
            }
        }
        return 'A'; // Default value if all characters are the same
    }

}

