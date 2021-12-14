package model01;

public class Vehicle {

    private String number;
    private String type;
    private String weight;
    private String passengers;
    private String availability;

    public Vehicle(String number, String type, String weight, String passengers) {
        this.number = number;
        this.type = type;
        this.weight = weight;
        this.passengers = passengers;
        this.availability = "true";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
