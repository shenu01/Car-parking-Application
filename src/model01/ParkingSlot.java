package model01;

public class ParkingSlot {
    public String slot;
    public String vehicleType;


    public ParkingSlot(String slot, String vehicleType ) {
        this.slot = slot;
        this.vehicleType = vehicleType;


    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


}
