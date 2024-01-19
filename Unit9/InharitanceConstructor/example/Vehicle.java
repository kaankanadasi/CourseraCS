public class Vehicle {
    private double speed;
    private String type;
    private int cost;

    public Vehicle(double speed, String type, int cost) {
        this.speed = speed;
        this.type = type;
        this.cost = cost;
    }

    public void state(String type, double speed) {
        if (speed > 0) {
            System.out.println("The" + type + "is moving");
        } else {
            System.out.println("The" + type + "is stopped");
        }
    }

    public double getSpeed() {
        return speed;
    }
}