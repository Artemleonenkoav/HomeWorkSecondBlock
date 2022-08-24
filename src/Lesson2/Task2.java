package Lesson2;// + Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// + Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// + Перегрузить конструкторы.
// + Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Task2 {

    public static class Car {

        private int year;
        private double speed;
        private int weight;
        private String color;

        public Car() {
        }

        public Car(int year) {
            this.year = year;
        }

        public Car(int year, double speed) {
            this(year);
            this.speed = speed;
        }

        public Car(int year, double speed, int weight) {
            this(year, speed);
            this.weight = weight;
        }

        public Car(int year, double speed, int weight, String color) {
            this(year, speed, weight);
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Car first = new Car(21);
        Car two = new Car(50, 87);
        Car third = new Car(23, 66, 98);
        Car fourth = new Car(77, 56, 87, "Black");
    }
}
