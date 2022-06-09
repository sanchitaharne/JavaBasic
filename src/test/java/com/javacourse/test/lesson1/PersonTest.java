package com.javacourse.test.lesson1;
import com.javacourse.lesson1.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest{

    @Test
    public void returnHelloWorld(){
        Person sanchita = new Person();
        assertEquals("Hello World", sanchita.helloWorld());
    }

    @Test
    public void returnHelloSanchita(){
        Person person1 = new Person();
        assertEquals("Hello Sanchita", person1.sayHello("Sanchita"));
    }



}