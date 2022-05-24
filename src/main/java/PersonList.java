//Create a PersonsList class that holds a List of Person objects.
// Create a findByName method.
// The method should take in a String name and return the Person with a name that matches exactly.
// The Person name property and the method name parameter should be formatted as "firstName lastName".
// Throw an exception if the name parameter is not properly formatted. Include all tests.

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private ArrayList <Person> persons;

    public PersonList() {
        persons = new ArrayList<Person>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public Person findByName(String name) {

        Person findedPerson = new Person();

        for (Person p : persons) {
            if(p.getName().equals(name)){
                findedPerson = p;

            }
        }
             return findedPerson;

        }

    @Override
    public String toString() {
        return "PersonList{" +
                "persons=" + persons +
                '}';
    }
}

