import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemsByPrice {
	private Price price;
//	private SiteA siteA;
	private SiteWrapper siteWrapper;
	public ItemsByPrice(Price price, SiteWrapper siteWrapper) {
		this.price = price;
		this.siteWrapper = siteWrapper;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.siteWrapper.getSiteValue()) {
				if ((Integer) item.get("price") <= this.price.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}