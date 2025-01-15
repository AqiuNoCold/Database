package Model;

/**
 * Customer 数据模型
 */
public class Customer {
    private String customerID;
    private String name;
    private String password;
    private int accountBalance;
    private String phone;
    private String email;
    private String identity;
    private int rank;

    public Customer(String customerID, String name, String password, int accountBalance, String phone, String email, String identity, int rank) {
        this.customerID = customerID;
        this.name = name;
        this.password = password;
        this.accountBalance = accountBalance;
        this.phone = phone;
        this.email = email;
        this.identity = identity;
        this.rank = rank;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", accountBalance=" + accountBalance +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                ", rank=" + rank +
                '}';
    }
}