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


}
