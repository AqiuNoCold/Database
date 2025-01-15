package Model;

/**
 * Aircraft 数据模型
 */
public class Aircraft {
    private String aircraftID;
    private String aircraftType;
    private int economySeats;
    private int businessSeats;

    public Aircraft(String aircraftID, String aircraftType, int economySeats, int businessSeats) {
        this.aircraftID = aircraftID;
        this.aircraftType = aircraftType;
        this.economySeats = economySeats;
        this.businessSeats = businessSeats;
    }

    public String getAircraftID() {
        return aircraftID;
    }

    public void setAircraftID(String aircraftID) {
        this.aircraftID = aircraftID;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftID='" + aircraftID + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", economySeats=" + economySeats +
                ", businessSeats=" + businessSeats +
                '}';
    }
}
