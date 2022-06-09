package com.javacourse.lesson1;
import com.javacourse.lesson2.Name;
public class Person {

    private Name personName;
    private static int personCounter;
    public Person(Name personName){
        this.personName = personName;
    }

    public Person() {
        personCounter++;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String sayHello(String person) {
        return "Hello " + person;
    }

    public static int returnNumberOfPersons() {
        return personCounter;
    }
}
