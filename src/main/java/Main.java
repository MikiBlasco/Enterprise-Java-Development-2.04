

//Create a method that takes a Person object as a parameter and used the toString method to write the Person information to a file. Handle any errors as necessary.

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

       //TSETING NEGATIVE AGE IN THE CONSTRUCTOR

        try {
            Person p1 = new Person(450, "Miki Was", 20, "no hace nada");
        } catch (IllegalArgumentException e){
            System.err.println("p1 creation:  Age can not be negative");
            e.printStackTrace();
        } finally {
            System.out.println("P1 created successfully");
        }

        //TSETING NEGATIVE AGE AFTER CONSTRUCTOR

        Person p2 = new Person(451, "Piki Yas", 50, "no hace nada de nada");

        try{
            p2.setAge(-10);
        } catch (IllegalArgumentException e){
            System.out.println("P2 seting Age: Age can not be negative. Invalid action");
        } finally {
            System.out.println("P2 new Age: " + p2.getAge());
        }

        System.out.println(p2.getAge());

        //USING CLONE METHOD

        Person p3 = p2.clone();
        Person p4 = p3.clone();
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);



        Person p5 = new Person(441, "Viki Boom", 40, "no hace casi nada");


        Person p6 = p5.clone();
        p2.setName("Miki Blasco");
        p6.setName("Joselito Gutierrez");
        p5.setName("Miquel Blasco");
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);
        System.out.println("p2: " + p2);


        //USING EQUAL METHOD

        System.out.println("p3 vs p4 must be true (equal) => " + p3.equals(p4));
        System.out.println("p3 vs p5 must be false (not equal) => " + p3.equals(p5));


        //FILLING PERSONLIST

        PersonList persons = new PersonList();
        persons.addPerson(p2);
        persons.addPerson(p3);
        persons.addPerson(p4);
        persons.addPerson(p5);
        persons.addPerson(p6);

        System.out.println(persons);

        //FINDBYNAME METHOD

        System.out.println(persons.findByName("Miki Blasco"));

        //CATCHING WRONG NAME EXCEPTION :

        try {
            p6.setName("Joe Jou");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            System.err.println("Catching the wrong format on Name: format required: 'name' + 'surname' ");
        } finally {
            System.out.println("name edited successfully" );
        }
        System.out.println("new p6: " + p6);

       //PERSON TO A FILE
        FileWriter fileWriter = new FileWriter("./newPerson.txt", false);
        fileWriter.write(p2.toString() + "\n");
        fileWriter.write(p3.toString() + "\n");
        fileWriter.write(p4.toString() + "\n");
        fileWriter.write(p5.toString() + "\n");
        fileWriter.write(p6.toString() + "\n");

        fileWriter.close();


    }




}
