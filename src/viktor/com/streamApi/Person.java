package viktor.com.streamApi;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person() { }

    public Person(String nm, String sur, int a) {
        this.name = nm;
        this.surname = sur;
        this.age = a;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                 name + ' ' +
                 surname +
                " age = " + age;
    }
}
