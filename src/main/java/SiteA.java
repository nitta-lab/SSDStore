import java.util.*;

public class SiteA {
	private List<Map<String, Object>> value = new ArrayList<>();
	public List<Map<String, Object>> getValue() {
		return new ArrayList<>(this.value);
	}
	public void addProductToSiteA(int capacity, int price) {
		Map<String, Object> temp_nil = new HashMap<String, Object>();
		temp_nil.put("price",price);
		temp_nil.put("capacity",capacity);
		this.value.add(0, temp_nil);
	}
}