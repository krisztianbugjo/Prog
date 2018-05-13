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

	
	@Test
	public void test2() {
		 Assert.assertEquals(calculatePriceByCustomer("Nyugdijas",2),1000);
		 
		 
			
	}
	
	public int calculatePriceByCustomer(String customer, int mennyiseg) {
		int price = 0;
		switch (customer) {
			
			
	case "Felnott":
		price = mennyiseg * 1000;
		break;
	case "Diak":
		price = mennyiseg * 500;
		break;
	case "Nyugdijas":
		price = mennyiseg * 500;
		break;
	case "Gyerek":
		price = 0;
			}
		return price;
}
	
	@Test
	public void test3() {
	 Assert.assertEquals(calculatePriceByCustomer("Gyerek",2),0);
	}
}