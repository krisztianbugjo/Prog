import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PriceTest {

	@Test
	public void test() {
		 Assert.assertEquals(calculatePrice(1000,2),2000);
	
	}
	
	public int calculatePrice(int price, int time) {
		return price * time;
		
	}

}
