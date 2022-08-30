//        + Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
//        + void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//        + Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//        Написать программу, которая выполняет проигрывание и запись.

package Task1;

public class Task1 {
    private static Object Player;

    interface Playable {
        void play();

        void pause();

        void stop();
    }

    interface Recodable {
        void record();

        void pause();

        void stop();
    }

    public  class Player implements Playable, Recodable {
        @Override
        public void play() {
            System.out.println("Play");

        }

        @Override
        public void record() {

        }

        @Override
        public void pause() {

        }

        @Override
        public void stop() {

        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Object player = Task1.Player;

    }
}
