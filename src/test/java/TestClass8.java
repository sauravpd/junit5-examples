import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestClass8 
{
	@Nested
	class InnerClass1
	{
		@Test
		public void innerTest1() {
			System.out.println("InnerClass1: test1");
		}
		@Test
		public void innerTest2() {
			System.out.println("InnerClass1: test2");
		}
	}
	
	@Nested
	class InnerClass2
	{
		@Test
		public void innerTest1() {
			System.out.println("InnerClass2: test1");
		}
		@Test
		public void innerTest2() {
			System.out.println("InnerClass2: test2");
		}
	}
}
