public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Address address;
    private int toBePaidPrice = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getToBePaidPrice() {
        return toBePaidPrice;
    }

    public void setToBePaidPrice(int toBePaidPrice) {
        this.toBePaidPrice = toBePaidPrice;
    }
}
