import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {

        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {

        myString = null;
    }

    //first test case
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("HELLO");
        assertTrue(myString.detectCapitalUse());
    }

    //second test case
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("World");
        assertTrue(myString.detectCapitalUse());
    }

    //third test case
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Night");
        assertTrue(myString.detectCapitalUse());
    }
    //fourth test case
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("RaspBerry");
        assertFalse(myString.detectCapitalUse());
    }
}
