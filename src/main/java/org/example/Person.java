package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;

    public Person(String firstname, String lastname, int age) {
      this.firstName = firstname;
      this.lastName = lastname;
      this.age = age;
    }
    public Person(String firstname, String lastname, int age, double salary,boolean isMarried, String[] hobbies) {
        this(firstname, lastname, age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;

    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isTeen(){
        return (this.age >= 13 && this.age <= 19);
    }
    public String[] getHobbies() {
        return hobbies;
    }
}
