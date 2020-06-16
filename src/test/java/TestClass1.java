import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClass1 
{
	@Test
	public void test1()
	{
		System.out.println("test 1");
	}

	@Test
	public void test2()
	{
		System.out.println("test 2");
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("****@BeforeAll****");
	}

	@AfterAll
	static void afterAll(){
		System.out.println("****@AfterAll****");
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("****@BeforeEach****");
	}

	@AfterEach
	void afterEach(){
		System.out.println("****@AfterEach****");
	}


}
