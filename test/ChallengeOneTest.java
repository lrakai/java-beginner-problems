import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeOneTest {

    protected void setUp() {
    }

    @Test
    public void test() {
        var result = ChallengeOne.add();
        assertTrue(result == 3);
    }
}