import java.util.*;

public class ItemsByPrice {
	private Price price;
	private SiteWrapper SiteWrapper;
	public ItemsByPrice(Price price, SiteWrapper SiteWrapper) {
		this.price = price;
		this.SiteWrapper = SiteWrapper;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.SiteWrapper.getSiteAValue()) {
				if ((Integer) item.get("price") <= this.price.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}