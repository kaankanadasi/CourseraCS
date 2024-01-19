// inheritance = the process where one class acquares the attributes and methods of another

public class Main {
    public static void main(String[] args) {
        Car car = new Car(60.5, "Bentley", 210000, 4);
        car.state();

        Bike bike = new Bike(10.5, "some bike", 1000, 2);
        bike.state();

        System.out.println(car.getSpeed());
        System.out.println(bike.getSpeed());
    }
}