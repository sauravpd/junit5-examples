import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class TestClass9 
{
	@RepeatedTest(5)
	public void test1(RepetitionInfo info) {
		System.out.println("TestClass9: test1 - "+info.getCurrentRepetition());
	}
}
