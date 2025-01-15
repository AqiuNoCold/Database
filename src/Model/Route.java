package Model;

/**
 * Route 数据模型
 */
public class Route {
    private String routeID;
    private String departureAirportID;
    private String arrivalAirportID;

    public Route(String routeID, String departureAirportID, String arrivalAirportID) {
        this.routeID = routeID;
        this.departureAirportID = departureAirportID;
        this.arrivalAirportID = arrivalAirportID;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getDepartureAirportID() {
        return departureAirportID;
    }

    public void setDepartureAirportID(String departureAirportID) {
        this.departureAirportID = departureAirportID;
    }

    public String getArrivalAirportID() {
        return arrivalAirportID;
    }

    public void setArrivalAirportID(String arrivalAirportID) {
        this.arrivalAirportID = arrivalAirportID;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeID='" + routeID + '\'' +
                ", departureAirportID='" + departureAirportID + '\'' +
                ", arrivalAirportID='" + arrivalAirportID + '\'' +
                '}';
    }
}
