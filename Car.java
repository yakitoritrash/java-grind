public class Car {
    int carCount = 0; // Shared across all Car objects

    public Car() {
        carCount++; // Incremented for every new Car created
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car2.carCount); // Output: 2 (NOT car1.carCount)
    }
}
