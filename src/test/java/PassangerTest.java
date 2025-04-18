import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassangerTest {
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
    @Test
    void testTitleSuccess()
    {
        assertEquals("Mr",myPass.getTitle());
        Passanger myPass2 = new Passanger("Ms","Ciara","Flanagan");
        assertEquals("Ms",myPass2.getTitle());
        Passanger myPass3 = new Passanger("Mrs","Aileen","Flanagan");
        assertEquals("Mrs",myPass3.getTitle());
    }


    @Test
    void testTitleFail()
    {
        // Mr,Mrs or Ms only
        assertThrows(IllegalArgumentException.class,()->{new Passanger("Dr","Patrick","Flanagan");});
    }
    @Test
    void testShortFirst()
    {
        Exception ex=assertThrows(IllegalArgumentException.class,()->{new Passanger("Mr","Pa","Flanagan");});
        assertEquals("Invalid first name length", ex.getMessage());
    }

    @Test
    void testShortLast()
    {
        Exception ex=assertThrows(IllegalArgumentException.class,()->{new Passanger("Mr","Patrick","Fl");});
        assertEquals("Invalid last name length", ex.getMessage());
    }
}
