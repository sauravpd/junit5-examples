import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass2 
{
	@Test
	public void testAddMethod1()
	{
		System.out.println("testAddMethod1");
		Assertions.assertEquals(50,Calc.add(20, 30));// PASS
	}
	
	@Test
	public void testAddMethod2()
	{
		System.out.println("testAddMethod2");
		Assertions.assertEquals(40,Calc.add(20, 30));// FAIL org.opentest4j.AssertionFailedError: expected: <50> but was: <40>
	}
}
