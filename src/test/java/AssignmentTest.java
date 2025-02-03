import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {
    @Test
    public void testProcessString() {
        Assignment assignment = new Assignment();
        assertEquals("hello", assignment.processString("hello"), "Should return input string unchanged");
        assertEquals("HELLO", assignment.processString("HELLO"), "Should return input string unchanged");
    }

    @Test
    public void testCalculateSum() {
        Assignment assignment = new Assignment();
        assertEquals(6, assignment.calculateSum(new int[]{1, 2, 3}), "Should return sum of all numbers");
        assertEquals(0, assignment.calculateSum(new int[]{}), "Should return 0 for empty array");
        assertEquals(-3, assignment.calculateSum(new int[]{-1, -2}), "Should handle negative numbers");
    }
}