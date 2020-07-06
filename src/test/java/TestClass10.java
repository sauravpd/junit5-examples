import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestClass10 
{
	@Test
	@Tag("smoke")
	public void test1() 
	{
		System.out.println("TestClass10: test1");
	}

	@Test
	@Tag("regression")
	public void test2() {
		System.out.println("TestClass10: test2");
	}

	@Test
	@Tag("smoke")
	public void test3() {
		System.out.println("TestClass10: test3");
	}

	@Test
	@Tag("regression")
	public void test4() {
		System.out.println("TestClass10: test4");
	}
}
