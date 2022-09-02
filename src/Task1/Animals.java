// + Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
// + целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
// + должен возвращать название экземпляра и возраст животного.

package Task1;

enum Animals {

    DOG(50), CAT(30), TIGER(55);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animals animals = Animals.DOG;
        Animals animalse = Animals.CAT;
        Animals animalss = Animals.TIGER;
        System.out.println("Age animal is " + animals.age);
        System.out.println("Age animal is " + animalse.age);
        System.out.println("Age animal is " + animalss.age);

    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                '}';
    }
}

