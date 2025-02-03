import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {
    
    @Test
    @DisplayName("Testing String initialization")
    public void testStringVariable() {
        Assignment assignment = new Assignment();
        assertNotNull(assignment.myString, 
            "❌ The String variable 'myString' is null. Initialize it with any non-empty string like \"Hello\" or \"Java\"");
        assertTrue(assignment.myString.length() > 0, 
            "❌ The String variable 'myString' is empty. It should contain some text, for example: \"Hello\" or \"Java\"");
    }

    @Test
    @DisplayName("Testing integer initialization")
    public void testIntVariable() {
        Assignment assignment = new Assignment();
        assertNotEquals(0, assignment.myInt, 
            "❌ The integer variable 'myInt' is still 0. Initialize it with any non-zero number like 42 or -7");
    }

    @Test
    @DisplayName("Testing double initialization")
    public void testDoubleVariable() {
        Assignment assignment = new Assignment();
        assertNotEquals(0.0, assignment.myDouble, 
            "❌ The double variable 'myDouble' is still 0.0. Initialize it with any non-zero decimal number like 3.14 or -2.5");
    }

    @Test
    @DisplayName("Testing boolean initialization")
    public void testBooleanVariable() {
        Assignment assignment = new Assignment();
        // This test just verifies the boolean is initialized to either true or false
        assertTrue(assignment.myBoolean || !assignment.myBoolean, 
            "❌ The boolean variable 'myBoolean' needs to be initialized to either true or false");
    }

    @Test
    @DisplayName("Testing String array initialization")
    public void testStringArray() {
        Assignment assignment = new Assignment();
        assertNotNull(assignment.myStringArray, 
            "❌ The String array 'myStringArray' is null. Initialize it like this: new String[]{\"apple\", \"banana\", \"cherry\"}");
        
        assertTrue(assignment.myStringArray.length >= 3, 
            "❌ The String array 'myStringArray' should have at least 3 elements. Current length: " + 
            (assignment.myStringArray != null ? assignment.myStringArray.length : 0));
        
        if (assignment.myStringArray != null && assignment.myStringArray.length >= 3) {
            for (int i = 0; i < assignment.myStringArray.length; i++) {
                assertNotNull(assignment.myStringArray[i], 
                    "❌ Element at index " + i + " in myStringArray is null. All elements should be non-null strings");
            }
        }
    }

    @Test
    @DisplayName("Testing integer array initialization")
    public void testIntArray() {
        Assignment assignment = new Assignment();
        assertNotNull(assignment.myIntArray, 
            "❌ The integer array 'myIntArray' is null. Initialize it like this: new int[]{1, 2, 3}");
        
        assertTrue(assignment.myIntArray.length >= 3, 
            "❌ The integer array 'myIntArray' should have at least 3 elements. Current length: " + 
            (assignment.myIntArray != null ? assignment.myIntArray.length : 0));
    }
}