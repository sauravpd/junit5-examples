import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass3 
{
	@Test
	public void test1()
	{
		System.out.println("test1");
		Assertions.assertThrows(NullPointerException.class, ()-> Calc.divide(10,0));// FAI expected: <java.lang.NullPointerException> but was: <java.lang.ArithmeticException>
	}

	@Test
	public void test2()
	{
		System.out.println("test2");
		Assertions.assertThrows(ArithmeticException.class, ()-> Calc.divide(10,0));// PASS
	}
}
