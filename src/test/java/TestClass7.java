import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClass7 
{

	@Test
	@DisplayName("TestClass7 test 1")
	public void test1() {
		System.out.println("test1");
		assertAll(
				()->assertEquals(20,Calc.add(10, 10)),
				()->assertEquals(30,Calc.add(20, 10)),
				()->assertEquals(40,Calc.add(20, 10)),//expected: <40> but was: <30>
				()->assertEquals(50,Calc.add(40, 10))
				);
	}
}
