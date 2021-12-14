package model01;

public class AddDriver {

    static Driver [] d;
    static int next;

    public AddDriver() {
        d=new Driver[16];
        next=0;
    }
    public void addDriver(Driver data){
        d[next++]=data;
    }
    public static Driver[] getArray(){
        return d;
    }

    public void addDAnotherVehicel(Driver driver) {
        Driver[]v1=new Driver[next+1];
        for (int a=0;a<next;a++){
            v1[a]=d[a];
        }
        v1[next++]=driver;
        d=v1;

    }
}
