package day36_custom_classes.car;

public class Street {
    public static void main(String[] args) {

        Car bmw = new Car("X5", "James", 31283284, 'c');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
    }
}
