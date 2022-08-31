// создайте статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
// измерения (к примеру, из метров в километры, из километров в мили, и так далее).

package Task2;

public class Distance {

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {
        int TC = 41;
        double TF = (9.0 / 5.0) * TC + 32;
        return TF;
    }
}