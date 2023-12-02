import java.util.*;

public class SSDStore {
	private SiteA siteA;
	private Capacity capacity;
	private Price price;
	private SiteWrapper siteWrapper;
	private ItemsByCapacity itemsByCapacity;
	private ItemsByPrice itemsByPrice;
	public SSDStore() {
		this.siteA = new SiteA();
		this.capacity = new Capacity();
		this.price = new Price();
		this.siteWrapper = new SiteWrapper(siteA);
		this.itemsByCapacity = new ItemsByCapacity(capacity, siteWrapper);
		this.itemsByPrice = new ItemsByPrice(price, siteWrapper);
	}
	public List<Map<String, Object>> getSiteA() {
		return siteA.getValue();
	}
	public int getCapacity() {
		return capacity.getValue();
	}
	public int getPrice() {
		return price.getValue();
	}
	public List<Map<String, Object>> getItemsByCapacity() {
		return itemsByCapacity.getValue();
	}
	public List<Map<String, Object>> getItemsByPrice() {
		return itemsByPrice.getValue();
	}
	public void setPrice(int cur_price) {
		this.price.setPrice(cur_price);
	}
	public void setCapacity(int cur_capacity) {
		this.capacity.setCapacity(cur_capacity);
	}
	public void addProductToSiteA(int capacity, int price) {
		this.siteA.addProductToSiteA(capacity, price);
	}
}