package com.javacourse.lesson1;
import com.javacourse.lesson2.Name;
public class Person {

    private Name personName;

    public Person(Name personName){
        this.personName = personName;
    }

    public Person() {
        // empty on purpose
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String sayHello(String person) {
        return "Hello " + person;
    }
}
