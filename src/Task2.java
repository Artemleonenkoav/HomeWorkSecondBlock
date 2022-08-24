// + Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// + Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Task2 {
    int year;
    double speed;
    int weight;
    String color;

    public Task2() {
    }

    public Task2(int year) {

    }

    public Task2(int year, double speed) {

    }

    public Task2(int year, double speed, int weight) {
    }


    public Task2(int year, int speed, int weight, String color) {
    }

    public static void main(String[] args) {
        Task1 first = new Task1(50);
        Task1 two = new Task1(50, "Red");

    }
}
