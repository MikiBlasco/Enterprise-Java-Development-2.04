import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

Person person;

    @BeforeEach
    public void init() {
    person  = new Person();

    }
    @Test
    @DisplayName("Comprobar si la edad funciona")
    public void setAge_Correcntly() {
    person.setAge(10);
    assertEquals(10, person.getAge());
    }

    @Test
    @DisplayName("Si la edad es negativa nos devuelve una excepción")
    public void setAge_Over_0_orException() {
        assertThrows(IllegalArgumentException.class, () -> person.setAge(-10));
    }

    @Test
    @DisplayName("Tiene que clonar una Persona pero con un ID diferente")
    public void clonePerson_differentId() {
        Person person = new Person(100, "Joni Walker", 35, "drinker");
        Person personCloned = person.clone();
        assertEquals(true, person.equals(personCloned));
    }

    @Test
    @DisplayName("Tiene que lanzar un error de excepción cuando el nombre no tenga el formato adecuado")
    public void findByName_witCorrectFormatName() {
        Person p1 = new Person(450, "Miki Was", 20, "no hace nada");
        Person p2 = new Person(451, "Piki Yas", 50, "no hace nada de nada");
        Person p3 = new Person(100, "Joni Walker", 35, "drinker");

        PersonList personList = new PersonList();
        personList.addPerson(p1);
        personList.addPerson(p2);
        personList.addPerson(p3);

        assertThrows(IllegalArgumentException.class, () -> personList.findByName("Miki"));


    }

    @Test
    @DisplayName("Tiene que devolver una excepción cuando intentamos dar un nombre con formato incorrecto")
    public void throwException_whenSetWrongName() {

        Person p1 = new Person(450, "Miki Was", 20, "no hace nada");
        assertThrows(IllegalArgumentException.class, () -> person.setName("Miki Blasco Blasco"));
        assertThrows(IllegalArgumentException.class, () -> person.setName("Miki " +
                ""));
        assertThrows(IllegalArgumentException.class, () -> person.setName("Miki"));


    }





}
