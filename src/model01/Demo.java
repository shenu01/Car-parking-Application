package model01;

import sun.rmi.runtime.NewThreadAction;

public class Demo {
 public static AddVehicle add;
 public static  AddDriver addD;

    public static void test(String[]args) {

      add= new AddVehicle();
     add.addData(new Vehicle("KA-4563", "Van", "1000", "7"));
     add.addData(new Vehicle("58-3567", "Van", "1500", "4"));
     add.addData(new Vehicle("GF-4358", "Van", "800", "4"));
     add.addData(new Vehicle("CCB-3568", "Van", "1800", "8"));
     add.addData(new Vehicle("KB-3668", "Cargo Lorry", "2500", "2"));
     add.addData(new Vehicle("JJ-9878", "Cargo Lorry", "3000", "2"));
     add.addData(new Vehicle("GH-5772", "Cargo Lorry", "4000", "3"));
     add.addData(new Vehicle("XY-4456", "Cargo Lorry", "3500", "2"));
     add.addData(new Vehicle("YQ-3536", "Cargo Lorry", "2000", "2"));
     add.addData(new Vehicle("CBB-3566", "Cargo Lorry", "2500", "2"));
     add.addData(new Vehicle("QH-3444", "Cargo Lorry", "1000", "4"));
     add.addData(new Vehicle("LM-6679", "Van", "1500", "4"));
     add.addData(new Vehicle("QA-3369", "Van", "1800", "6"));
     add.addData(new Vehicle("NA-3434", "Bus", "3500", "60"));

       addD = new AddDriver();
     addD.addDriver(new Driver("Sumith Kumara", "7835348345V", "B6474845", "Panadura", "0725637456"));
     addD.addDriver(new Driver("Amila Pathirana", "8826253734V", "B3354674", "Galle", "0717573583"));
     addD.addDriver(new Driver("Jithmal Perera", "9283289272V", "B3674589", "Horana", "0772452457"));
     addD.addDriver(new Driver("Sumith Dissanayaka", "9425245373V", "B8366399", "Kaluthara", "0782686390"));
     addD.addDriver(new Driver("Sumanasiri Herath", "8976544373V", "B3537538", "Beruwala", "0772534436"));
     addD.addDriver(new Driver("Awantha Fernando", "9173537839V", "B3554789", "Colombo 5", "0714534356"));
     addD.addDriver(new Driver("Charith Sudara", "9573536833V", "B6835836", "Baththaramulla", "0771536662"));
     addD.addDriver(new Driver("Prashan Dineth", "9362426738V", "B2683536", "Wadduwa", "0715353434"));
     addD.addDriver(new Driver("Chethiya Dilan", "", "B6836836", "Panadura", "0772436737"));
     addD.addDriver(new Driver("Dushantha Perera", "9162353436V", "B3334435", "Matara", "0777245343"));
     addD.addDriver(new Driver("Sumith Udayanga", "8735354355V", "B3573783", "Galle", "0703635442"));
     addD.addDriver(new Driver("Dinesh Udara", "9026344373V", "B5343783", "Hettimulla", "0713456878"));
     addD.addDriver(new Driver("Udana Chathuranga", "9692653338V", "B7888632", "Kottawa", "0772442444"));
     addD.addDriver(new Driver("Mohommad Riaz", "9124537733V", "B3638537", "Kaluthara", "0777544222"));
     addD.addDriver(new Driver("Sandun Kumara", "9563524267V", "B2263333", "Panadura", "0772325544"));
     addD.addDriver(new Driver("Priyanga Perera", "9135343537V", "B3853753", "Matara", "0723344562"));

     AddSlot addC = new AddSlot();
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Cargo Lorry"));
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Van"));
     addC.addData(new ParkingSlot("True", "Bus"));


    }
    public static void addAnotherVehicel(String Number,String type,String weight,String pass){
     add.addAnotherVehicel(new Vehicle(Number,type,weight,pass));

    }
    public static void addAnotherDriver(String Name,String Driver,String Nic,String Address,String Contact){
        addD.addDAnotherVehicel(new Driver(Name,Driver,Nic,Address,Contact));
    }
}
