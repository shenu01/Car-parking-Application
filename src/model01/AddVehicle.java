package model01;

public class AddVehicle {

    static Vehicle[] v;
    static int next;

    public AddVehicle() {
        v = new Vehicle[14];
        next = 0;
    }

    public void addData(Vehicle data) {
        v[next++] = data;
    }

    public static Vehicle[] getArry() {
        return v;
    }

    public static String getVehicleType(String data){
       String VehicelType="";
    for (int i=0;i<v.length;i++){
        if (v[i].getNumber().equals(data)){
            VehicelType =v[i].getType();
        }
    }
    return VehicelType;
    }

    public void addAnotherVehicel(Vehicle data){
        Vehicle[]v1=new Vehicle[next+1];
        for (int a=0;a<next;a++){
            v1[a]=v[a];
        }
        v1[next++]=data;
        v=v1;
    }

}
