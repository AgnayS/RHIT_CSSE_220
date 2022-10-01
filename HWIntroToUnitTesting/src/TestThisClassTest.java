import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestThisClassTest {

	@Test
	public void testNumberOfXs() 
	{
		
		assertEquals(3, TestThisClass.numberOfXs("xxx"));
		assertEquals(3, TestThisClass.numberOfXs("XXX"));
		assertEquals(3, TestThisClass.numberOfXs("XxX"));
		assertEquals(3, TestThisClass.numberOfXs("xXx"));
		assertEquals(0, TestThisClass.numberOfXs("y"));
		assertEquals(0, TestThisClass.numberOfXs(""));
		assertEquals(3, TestThisClass.numberOfXs("YXxX"));
		assertEquals(3, TestThisClass.numberOfXs("AXxX"));
	}

	@Test
	public void testCountChocula() 
	{
		assertEquals(0, TestThisClass.countChocula("y"));
		assertEquals(0, TestThisClass.countChocula(""));
		assertEquals(1, TestThisClass.countChocula("xChocula"));
		assertEquals(2, TestThisClass.countChocula("ChoculaChocula"));
		assertEquals(1, TestThisClass.countChocula("Chocula"));

	}

	@Test
	public void testPaintCost()
	{
		assertEquals(-1, TestThisClass.paintCost(-1,-2,3));
		assertEquals(0, TestThisClass.paintCost(0,5,7));
		assertEquals(6, TestThisClass.paintCost(1,2,3));
		assertEquals(-1, TestThisClass.paintCost(0,0,0));
		//the function shud return -1 if the paramter is not positive. 0 Is neither positive nor negative 
		//and hence shud return -1
	}

	@Test
	public void testPizzaCostCalculator()
	{
		ArrayList<String> s = new ArrayList<String>();
		
//check edge case of empty topping list
		assertEquals(8, TestThisClass.pizzaCostCalculator(s));

//add 2 bucks		
		s.add("pepperoni");
		assertEquals(10, TestThisClass.pizzaCostCalculator(s));
		
//add 2 more
		s.add("onions");
		assertEquals(12, TestThisClass.pizzaCostCalculator(s));
		
//it becomes a special now so shud stay 12
		s.add("sausage");
		assertEquals(12, TestThisClass.pizzaCostCalculator(s));
		
		s.remove("sausage");
		
		s.add("mustard");
		assertEquals(13, TestThisClass.pizzaCostCalculator(s));
		
		//now special +2
		s.add("pineapple");
		assertEquals(14, TestThisClass.pizzaCostCalculator(s));
		
		
		s.add("onions");
		s.add("sausage");
		
		assertEquals(16, TestThisClass.pizzaCostCalculator(s));
		
		
	}

}
