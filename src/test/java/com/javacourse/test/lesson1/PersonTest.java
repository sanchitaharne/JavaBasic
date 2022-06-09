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

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        assertEquals(5, Person.returnNumberOfPersons());
    }

    @Test
    public void demonstrateBoolean(){
        boolean monday = false;
        boolean friday = false;
        boolean tuesday = false;
        boolean sunny = false;
        if(monday ) {
            drinkBeer();
        }else if(friday) {
            drinkWater();
        }
        else if (sunny){
            goSwimming();
        }
        else{
            drinkMilk();
        }
    }

    private void drinkMilk() {
        System.out.println("drinking milk");
    }

    private void goSwimming() {
        System.out.println("Go Swimming");
    }

    private void drinkWater() {
        System.out.println("drinking water");
    }

    private void drinkBeer() {
        System.out.println("drinking beer");
    }
}