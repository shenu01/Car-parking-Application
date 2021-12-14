package model01;

public class AddSlot {
    static ParkingSlot parkingSlot[];
    static int next;

    public AddSlot() {
        parkingSlot = new ParkingSlot[14];
        next = 0;
    }
    public static void addData(ParkingSlot data) {
        parkingSlot[next++] = data;

    }
    public static ParkingSlot[] getArray(){
        return parkingSlot;
    }
    public static int searchSlot(String vehicleNumber,String type){
        for (int i = 0; i < parkingSlot.length; i++) {
            //System.out.println(parkingSlot[1].getSlot());
             if (parkingSlot[i].getVehicleType().equals(type)){
                for (int a=0;a<parkingSlot.length;a++){
                    if (parkingSlot[i].getVehicleType().equals(parkingSlot[a].getVehicleType())){
                        if (parkingSlot[a].getSlot().equals(vehicleNumber)){
                            return 0;

                        }
                    }
                }
            }
        }

        for (int j = 0; j < parkingSlot.length; j++) {
            if (type.equals(parkingSlot[j].getVehicleType())) {
                if (parkingSlot[j].slot.equals("True")) {
                     return j+1;


                }
            }

        }
return -1;
    }
}

