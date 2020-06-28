import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TestClass6 
{
	@Test
	@EnabledOnOs(OS.LINUX)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void test3() {
		System.out.println("test3");
		Assumptions.assumeTrue(false); //Assumption failed: assumption is not true
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void test4() {
		System.out.println("test4");
		Assumptions.assumeTrue(true); //PASS
	}
}
