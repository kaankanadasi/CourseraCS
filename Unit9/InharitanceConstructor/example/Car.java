public class Car extends Vehicle{
    private int numSeats;
    
    public Car(double speed, String type, int cost, int numSeats) {
        super(speed, type, cost);
        this.numSeats = numSeats;
    }  
}