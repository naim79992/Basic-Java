package Java_Basics.Class.Enum,POJO,Final_Classes;

public class POJO {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public POJO() {
    }

    // Parameterized constructor
    public POJO(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method for displaying object information
    @Override
    public String toString() {
        return "POJO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
