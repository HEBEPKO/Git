package VK_21;

public class Person {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name, int i) {
        this.name = name;
        this.age = getAge();
    }

    public void printInfo() {
        System.out.println("Меня завут - " + name + "\n Мой возраст " + getAge() + "лет");
    }
}
