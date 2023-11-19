import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestMultiSSDStoreUpdate {

	@Test
	public void test() {
		SSDStore store = new SSDStore();
		store.addProductToSiteA(500, 7000);
		store.addProductToSiteB(1500, 12000);
		
		store.setPrice(7000);
		List<Map<String, Object>> itemsByPrice = store.getItemsByPrice();
		assertEquals(itemsByPrice.size(), 1);
		for (Map<String, Object> item: itemsByPrice) {
			assertTrue((Integer) item.get("price") <= 7000);
		}		
		store.setPrice(12000);
		itemsByPrice = store.getItemsByPrice();
		assertEquals(itemsByPrice.size(), 2);
		for (Map<String, Object> item: itemsByPrice) {
			assertTrue((Integer) item.get("price") <= 12000);
		}
		
		store.setCapacity(500);
		List<Map<String, Object>> itemsByCapacity = store.getItemsByCapacity();
		assertEquals(itemsByCapacity.size(), 2);
		for (Map<String, Object> item: itemsByCapacity) {
			assertTrue((Integer) item.get("capacity") >= 500);
		}
		store.setCapacity(1500);
		itemsByCapacity = store.getItemsByCapacity();
		assertEquals(itemsByCapacity.size(), 1);
		for (Map<String, Object> item: itemsByCapacity) {
			assertTrue((Integer) item.get("capacity") >= 1500);
		}
				
		store.addProductToSiteB(1000, 10000);
		
		store.setPrice(7000);
		itemsByPrice = store.getItemsByPrice();
		assertEquals(itemsByPrice.size(), 1);
		for (Map<String, Object> item: itemsByPrice) {
			assertTrue((Integer) item.get("price") <= 7000);
		}		
		store.setPrice(12000);
		itemsByPrice = store.getItemsByPrice();
		assertEquals(itemsByPrice.size(), 3);
		for (Map<String, Object> item: itemsByPrice) {
			assertTrue((Integer) item.get("price") <= 12000);
		}

		store.setCapacity(500);
		itemsByCapacity = store.getItemsByCapacity();
		assertEquals(itemsByCapacity.size(), 3);
		for (Map<String, Object> item: itemsByCapacity) {
			assertTrue((Integer) item.get("capacity") >= 500);
		}
		store.setCapacity(1500);
		itemsByCapacity = store.getItemsByCapacity();
		assertEquals(itemsByCapacity.size(), 1);
		for (Map<String, Object> item: itemsByCapacity) {
			assertTrue((Integer) item.get("capacity") >= 1500);
		}
	}

}
