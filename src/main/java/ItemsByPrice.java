import java.util.*;

public class ItemsByPrice {
	private Price price;
	private SiteA siteA;
	public ItemsByPrice(Price price, SiteA siteA) {
		this.price = price;
		this.siteA = siteA;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.siteA.getValue()) {
				if ((Integer) item.get("price") <= this.price.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}