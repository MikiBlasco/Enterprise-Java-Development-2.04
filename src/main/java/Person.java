// Create a Person class that has properties id, name, age, and occupation.
// Throw an error if someone tries to set age to less than 0. Include all tests.

//Create a clone method.
// The clone method should take in a Person object and return a nearly identical object with new id.
// Override the equals method in the Person class to test for equivalency excluding id.
// Include all tests.

public class Person {

    private double id;
    private String name;
    private int age;
    private String occupation;

    private int idCounter;


    public Person() {

    }

    public Person(double id, String name, int age, String occupation) {
        setId(id);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Edad no puede ser inferior a 0");
        }else
          this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    protected Person clone() {
        return new Person(getId()+1, getName(), getAge(), getOccupation());

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(
                getName().equals(person.getName())
                        &&
                        getAge() == (person.getAge())
                        &&
                        getOccupation().equals(person.getOccupation())
        ) {
            return true;
        } else {
            return false;
        }
    }
}
