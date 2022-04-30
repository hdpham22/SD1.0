import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply() {
        assertEquals(16, SkillDemo.multiply(9, 2));
    }
}
