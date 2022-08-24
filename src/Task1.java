// + Используя IDEA, создайте проект c пакетом.
//// + Требуется: Создать класс Address.В теле класса требуется создать поля: index, country, city,
//// + street, house, apartment.
//// + Для каждого поля, создать метод с двумя методами доступа (get, set)
//// + Создать экземпляр класса Address.
//// + В поля экземпляра записать информацию о почтовом адресе.
//// + Выведите на экран значения полей, описывающих адрес.


public class Task1 {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private String apartment;

    public Task1() {

    }

    public Task1(int index, String country, String city, String street, int house, String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;

    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Task1 address = new Task1(66, "Ukraine", "Kharkiv", "Sumskay", 99, "Large");
        int addressIndex = address.getIndex();
        String addressCountry = address.getCountry();
        String addresscity = address.getCity();
        String addressstreet = address.getStreet();
        int addresshouse = address.getHouse();

        String addressapartamant = address.getApartment();
        System.out.println("Your index is " + addressIndex);
        System.out.println("Your country is " + addressCountry);
        System.out.println("Your city is " + addresscity);
        System.out.println("Your street is " + addressstreet);
        System.out.println("Your number house is " + addresshouse);
        System.out.println("Your apartament is " + addressapartamant);

    }
}

