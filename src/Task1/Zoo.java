// + Создать класс Zoo
// В классе создать список, в который записать 4 животных через метод add(index,element).
//Вывести список в консоль.

package Task1;

import java.util.ArrayList;


public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "Dog");
        arrayList.add(1, "Cat");
        arrayList.add(2, "Wild");
        arrayList.add(3, "Hors");

        System.out.println(arrayList);
    }
}
