

//Create a method that takes a Person object as a parameter and used the toString method to write the Person information to a file. Handle any errors as necessary.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Person p1 = new Person(450, "Miki", 20, "no hace nada");
        } catch (IllegalArgumentException e){
            System.out.println("p1 creation:  Age can not be negative");
            e.printStackTrace();
        } finally {
            System.out.println("P1 created succesfully");
        }


        Person p2 = new Person(451, "Piki", 50, "no hace nada de nada");

        try{
            p2.setAge(-10);
        } catch (IllegalArgumentException e){
            System.out.println("P2 seting Age: Age can not be negative. Invalid action");
        } finally {
            System.out.println("P2 new Age: " + p2.getAge());
        }

        System.out.println(p2.getAge());


        Person p3 = p2.clone();
        Person p4 = p3.clone();
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        Person p5 = new Person(441, "Viki", 40, "no hace casi nada");

        System.out.println(p5);

        System.out.println("p3 vs p4 must be true (equal) => " + p3.equals(p4));
        System.out.println("p3 vs p5 must be false (not equal) => " + p3.equals(p5));




    }

}
