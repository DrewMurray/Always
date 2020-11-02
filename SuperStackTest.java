import static org.junit.jupiter.api.Assertions.*;

public class SuperStackTest {

	@Test
	void testIsEmpty() {
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);

		result = stack.push(new Integer(0));
		result = stack.isEmpty();
		assertFalse(result);
	}

}
