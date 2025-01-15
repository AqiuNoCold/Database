package Model;

/**
 * User 数据模型
 */
public class User {
    private String userID;
    private String username;
    private String password;
    private String userType;
    private String name;

    public User(String userID, String username, String password, String userType, String name) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
