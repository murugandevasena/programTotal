import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator calculator =new Calculator();
	
	@Before
	public void before() {
		System.out.println("Test started!");
	}
	@Test
	public void testAdd() {
		System.out.println(calculator.calAdd(10,5));
	}
	
	@Test
	public void testSub() {
		System.out.println(calculator.calcSub(23, 2));
	}
	
	@Test
	public void testDivide() {
		System.out.println(calculator.calDivide(20, 2));
	}
	
	@Test
	public void toReverse() {
		assertEquals(calculator.reverse("dad"),"dad");
	}
	
	@After
	public void after() {
		System.out.println("Test Ended!");
	}

}
