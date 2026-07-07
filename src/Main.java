public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle();
        car1.licensePlate= "MH04HX1234";
        car1.brand="Toyota";
        car1.ratePerDay=3500.00;

        System.out.println("Rent of " + car1.brand + " with plate number " + car1.licensePlate + " is  " + car1.ratePerDay);

        Vehicle bike1 = new Vehicle();
        bike1.licensePlate= "MH12UI9879";
        bike1.brand="Hero Honda";
        bike1.ratePerDay= 560.89;

        System.out.println("Rent of " + bike1.brand + " with plate number " + bike1.licensePlate + " is  " + bike1.ratePerDay);

    }
}
