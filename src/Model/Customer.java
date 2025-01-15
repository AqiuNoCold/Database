package Model;

/**
 * Customer 数据模型
 */
public class Customer {
    private String customerID;
    private int accountBalance;
    private String phone;
    private String email;
    private int rank;

    public Customer(String customerID, int accountBalance, String phone, String email, int rank) {
        this.customerID = customerID;
        this.accountBalance = accountBalance;
        this.phone = phone;
        this.email = email;
        this.rank = rank;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", accountBalance=" + accountBalance +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", rank=" + rank +
                '}';
    }
}
