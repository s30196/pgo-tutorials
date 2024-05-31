public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("T", "1", 1999, 5000, 30);
        Vehicle truck = new Truck("Peterbilt", "2" , 2020, 500, 30, 5);

        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
