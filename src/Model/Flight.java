package Model;

import java.util.Date;

/**
 * Flight 数据模型
 */
public class Flight {
    private String flightID;
    private String routeID;
    private String aircraftID;
    private Date departureTime;
    private Date arrivalTime;
    private double economyPrice;
    private double businessPrice;

    public Flight(String flightID, String routeID, String aircraftID, Date departureTime, Date arrivalTime, double economyPrice, double businessPrice) {
        this.flightID = flightID;
        this.routeID = routeID;
        this.aircraftID = aircraftID;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getAircraftID() {
        return aircraftID;
    }

    public void setAircraftID(String aircraftID) {
        this.aircraftID = aircraftID;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(double economyPrice) {
        this.economyPrice = economyPrice;
    }

    public double getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(double businessPrice) {
        this.businessPrice = businessPrice;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", routeID='" + routeID + '\'' +
                ", aircraftID='" + aircraftID + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", economyPrice=" + economyPrice +
                ", businessPrice=" + businessPrice +
                '}';
    }
}
