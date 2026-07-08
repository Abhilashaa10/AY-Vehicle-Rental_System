import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle("MH16KP4557", "Suzuki",4560);
        car1.displayInfo();

        car1.rentout();
        car1.rentout();
        
        car1.returnVehicle();
        car1.rentout();

        System.out.println("Rate per day : " + car1.getRatePerDay()) ;

        car1.setRatePerDay(4000);
        car1.setRatePerDay(-500);

        System.out.println("rate per day " + car1.getRatePerDay());
    }
}
