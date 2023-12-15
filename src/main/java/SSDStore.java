import java.util.List;
import java.util.Map;

public class SSDStore {
	private Price price;
	private Capacity capacity;
	private SiteA siteA;
	private SiteB siteB;
	private SiteWrapper siteWrapper;
	private ItemsByCapacity itemsByCapacity;
	private ItemsByPrice itemsByPrice;
	public SSDStore() {
		this.price = new Price();
		this.capacity = new Capacity();
		this.siteA = new SiteA();
		this.siteB = new SiteB();
		this.siteWrapper = new SiteWrapper(siteA, siteB);
		this.itemsByCapacity = new ItemsByCapacity(capacity, siteWrapper);
		this.itemsByPrice = new ItemsByPrice(price, siteWrapper);
	}
	public int getPrice() {
		return price.getValue();
	}
	public int getCapacity() {
		return capacity.getValue();
	}
	public List<Map<String, Object>> getSiteA() {
		return siteA.getValue();
	}
	public List<Map<String, Object>> getItemsByCapacity() {
		return itemsByCapacity.getValue();
	}
	public List<Map<String, Object>> getItemsByPrice() {
		return itemsByPrice.getValue();
	}
	public void setCapacity(int cur_capacity) {
		this.capacity.setCapacity(cur_capacity);
	}
	public void setPrice(int cur_price) {
		this.price.setPrice(cur_price);
	}
	public void addProductToSiteA(int capacity, int price) {
		this.siteA.addProductToSiteA(capacity, price);
	}
	public void addProductToSiteB(int capacity, int price) {
		this.siteB.addProductToSiteB(capacity, price);
	}
}