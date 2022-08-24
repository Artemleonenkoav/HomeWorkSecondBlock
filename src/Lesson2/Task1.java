package Lesson2;// + Создать класс Машина с полями год(int), цвет(String).
// + Создать конструктор по умолчанию
// + конструктор с одним и 2-я параметрами.
// + Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

public class Task1 {
    public static class Car {
        private int year;
        private String color;


        public Car() {
        }

        public Car(int year) {
            this.year = year;
        }

        public Car(int year, String color) {
            this.year = year;
            this.color = color;
        }

        public static void main(String[] args) {
            Car first = new Car(50);
            Car two = new Car(50, "Red");
        }
    }
}

