import java.util.*;

public class SSDStore {
	private Capacity capacity;
	private SiteA siteA;
	private ItemsByCapacity itemsByCapacity;
	private Price price;
	private ItemsByPrice itemsByPrice;
	public SSDStore() {
		this.capacity = new Capacity();
		this.siteA = new SiteA();
		this.itemsByCapacity = new ItemsByCapacity(capacity, siteA);
		this.price = new Price();
		this.itemsByPrice = new ItemsByPrice(price, siteA);
	}
	public int getCapacity() {
		return capacity.getValue();
	}
	public void setCapacity(int cur_capacity) {
		this.capacity.setCapacity(cur_capacity);
	}
	public List<Map<String, Object>> getSiteA() {
		return siteA.getValue();
	}
	public void addProductToSiteA(int capacity, int price) {
		this.siteA.addProductToSiteA(capacity, price);
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