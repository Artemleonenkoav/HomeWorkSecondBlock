// + Создать класс, представляющий учебный класс ClassRoom.
// + Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
// + Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
// + переопределите каждый из методов, в зависимости от успеваемости ученика.
// + Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
// + Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
// Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
// отдыхать.

package Task1;

public class ClassRoom extends Pupil{
    Pupil pupil;



    public ClassRoom(Pupil name1, Pupil name2, Pupil name3, Pupil name4) {
        name1.read();
    }

    public ClassRoom(Pupil name1, Pupil name2, Pupil name3) {
    }

    public ClassRoom(Pupil name1, Pupil name2) {

    }


}



