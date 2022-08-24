// + Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// + Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Task2 {

    public class Car{

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
    }

    public Car(int year) {

    }

    public Car(int year, double speed) {

    }

    public Car(int year, double speed, int weight) {
    }


    public Car(int year, int speed, int weight, String color) {
    }
    }
    public static void main(String[] args) {
        Car first = new Car(50);
        Car two = new Car(50, "Red");

    }
}
