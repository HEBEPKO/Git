package VK_21;

import java.util.Scanner;

public class Program {
    public void main(String[] args) {
        System.out.println("Создание фичи VK-21");

        Person person;
        person = new Person("Olga",18);
        person.printInfo();
    }
    class Person {
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

        Person(String name,int age) {
            this.name = name;
            this.age = getAge();
        }

        public void printInfo() {
            System.out.println("Меня завут - " + name + "\n Мой возраст " + getAge() + "лет");
        }
    }

}
