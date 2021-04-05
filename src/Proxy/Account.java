package Proxy;

public class Account {
    int accountNumber;
    double ballance;
    String custName;
    String custAddress;
    String customerType;
    String creditRating;

    public Account(int a, double b, String c, String d, String e, String f) {
        accountNumber = a;
        ballance = b;
        custName = c;
        custAddress = d;
        customerType = e;
        creditRating = f;
    }

    public int getAccNo() {
        return accountNumber;
    }

    public void setAccNo(int accNo) {
        this.accountNumber = accountNumber;
    }

    public double getBal() {
        return ballance;
    }

    public void setBal(double ballance) {
        this.ballance = ballance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }
}
