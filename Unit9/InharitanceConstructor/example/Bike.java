public class Bike extends Vehicle {
    private int pedals; 

    public Bike(double speed, String type, int cost, int pedals) {
        super(speed, type, cost);
        this.pedals = pedals;
    }
}