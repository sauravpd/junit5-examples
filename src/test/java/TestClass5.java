import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClass5 
{
	@Test
	@DisplayName("TestClass5 test 1")
	public void test1() {
		System.out.println("test1");
	}

	@Test
	@Disabled// skip test
	@DisplayName("TestClass5 test 2")
	public void test2() {
		System.out.println("test2");
	}
}
