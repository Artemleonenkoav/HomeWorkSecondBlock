//Используя класс Zoo  удалить 2  животныx, узнать размер списка и вывести в консоль.

package Task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "Dog");
        arrayList.add(1, "Cat");
        arrayList.add(2, "Wild");
        arrayList.add(3, "Hors");
        arrayList.remove(1);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
