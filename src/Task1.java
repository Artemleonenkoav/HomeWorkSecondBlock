// + Создать класс Машина с полями год(int), цвет(String).
// + Создать конструктор по умолчанию
// + конструктор с одним и 2-я параметрами.
// + Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

public  class Task1 {
    private int year;
    private String color;

    public Task1() {
    }

    public Task1(int year) {
    }

    public Task1(int year, String color) {
    }

    public static void main(String[] args) {
        Task1 first = new Task1(50);
        Task1 two = new Task1(50, "Red");

    }
}

