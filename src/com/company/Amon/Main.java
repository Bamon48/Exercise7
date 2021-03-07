/*
Benton Amon
Exercise 7
Creates a Person class with a name and email, then extends that class to a Business Person class
where a phone number is also included.
 */

package com.company.Amon;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Tom", "cat@gmail.com");
        person1.display();
        Person person2 = new Person("Jerry", "mouse@gmail.com");
        person2.display();

        BusinessPerson person3 = new BusinessPerson("Master Chief", "halo@reach.com", "614-983-6984");
        person3.display();
        BusinessPerson person4 = new BusinessPerson("Bill Gates", "applesux@outlook.com", "928-234-1245");
        person4.display();


    }
}
