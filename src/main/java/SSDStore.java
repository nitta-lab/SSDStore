import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SSDStore {
	private Capacity capacity;
	private SiteWrapper siteWrapper;
	private ItemsByCapacity itemsByCapacity;
	private Price price;
	private ItemsByPrice itemsByPrice;
	public SSDStore() {
		this.capacity = new Capacity();
		this.siteWrapper = new SiteWrapper(new SiteA());
		this.itemsByCapacity = new ItemsByCapacity(capacity, siteWrapper);
		this.price = new Price();
		this.itemsByPrice = new ItemsByPrice(price, siteWrapper);
	}
	public int getCapacity() {
		return capacity.getValue();
	}
	public void setCapacity(int cur_capacity) {
		this.capacity.setCapacity(cur_capacity);
	}
	public List<Map<String, Object>> getSiteWrapper() {
		if(Objects.isNull(siteWrapper)) {
			return null;
		}
		return siteWrapper.getSiteValue();
	}
	public void addProductToSiteA(int capacity, int price) {
		this.siteWrapper.addProductToSiteA(capacity, price);
	}
	public List<Map<String, Object>> getItemsByCapacity() {
		return itemsByCapacity.getValue();
	}
	public int getPrice() {
		return price.getValue();
	}
	public void setPrice(int cur_price) {
		this.price.setPrice(cur_price);
	}
	public List<Map<String, Object>> getItemsByPrice() {
		return itemsByPrice.getValue();
	}
}