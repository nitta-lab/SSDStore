import java.util.*;

public class SSDStore {
	private Price price;
	private SiteA siteA;
	private SiteWrapper siteWrapper;
	private ItemsByPrice itemsByPrice;
	private Capacity capacity;
	private ItemsByCapacity itemsByCapacity;
	public SSDStore() {
		this.price = new Price();
		this.siteA = new SiteA();
		this.siteWrapper = new SiteWrapper(siteA);
		this.itemsByPrice = new ItemsByPrice(price, siteWrapper);
		this.capacity = new Capacity();
		this.itemsByCapacity = new ItemsByCapacity(capacity, siteWrapper);
	}
	public int getPrice() {
		return price.getValue();
	}
	public List<Map<String, Object>> getSiteA() {
		return siteA.getValue();
	}
	public List<Map<String, Object>> getItemsByPrice() {
		return itemsByPrice.getValue();
	}
	public int getCapacity() {
		return capacity.getValue();
	}
	public List<Map<String, Object>> getItemsByCapacity() {
		return itemsByCapacity.getValue();
	}
	public void setPrice(int cur_price) {
		this.price.setPrice(cur_price);
	}
	public void addProductToSiteA(int capacity, int price) {
		this.siteA.addProductToSiteA(capacity, price);
	}
	public void setCapacity(int cur_capacity) {
		this.capacity.setCapacity(cur_capacity);
	}
}