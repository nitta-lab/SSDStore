import java.util.*;

public class ItemsByPrice {
	private SiteWrapper siteWrapper;
	private Price price;
	public ItemsByPrice(SiteWrapper siteWrapper, Price price) {
		this.siteWrapper = siteWrapper;
		this.price = price;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.siteWrapper.getSiteAValue()) {
				if ((Integer) item.get("price") <= this.price.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}