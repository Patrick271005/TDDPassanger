import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassenger {
    Passanger myPass;

    @BeforeEach
    void setup()
    {
        myPass=new Passanger("Mr","Patrick","Flanagan");
    }
    @Test
    void ConstructorSuccess()
    {
        assertEquals("Mr",myPass.getTitle());
        assertEquals("Patrick",myPass.getFirstName());
        assertEquals("Flanagan",myPass.getLastName());
    }
}
