package Model;

import java.util.Date;

/**
 * Order 数据模型
 */
public class Order {
    private String orderID;
    private String customerID;
    private String buyerID;
    private String flightID;
    private String seatType;
    private String orderStatus;
    private String orderTime;

    public Order(String orderID, String customerID, String buyerID, String flightID, String seatType, String orderStatus, String orderTime) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.buyerID = buyerID;
        this.flightID = flightID;
        this.seatType = seatType;
        this.orderStatus = orderStatus;
        this.orderTime = orderTime;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", flightID='" + flightID + '\'' +
                ", seatType='" + seatType + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderTime='" + orderTime + '\'' +
                '}';
    }
}