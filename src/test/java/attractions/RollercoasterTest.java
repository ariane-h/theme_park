package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(14, 3, 50.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasMinHeightAge(){
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void ticketHasPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.01);
    }

    @Test
    public void priceDoublesOver2m(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }
}
