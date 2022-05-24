//Create a PersonsList class that holds a List of Person objects.
// Create a findByName method.
// The method should take in a String name and return the Person with a name that matches exactly.
// The Person name property and the method name parameter should be formatted as "firstName lastName".
// Throw an exception if the name parameter is not properly formatted. Include all tests.

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    List<Person> persons = new ArrayList<>();

    public PersonList(List<Person> persons) {
        this.persons = persons;
    }

    public Person findByName(String name) {

        Person findedPerson;

        for (Person p : persons) {
            if(p.getName().equals(name)){
                findedPerson = p;
                return findedPerson;
            }
        }
            return new Person();

        }



    }

