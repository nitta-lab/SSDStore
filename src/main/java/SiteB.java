import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiteB {
	private List<Map<String, Object>> value = new ArrayList<>();
	public List<Map<String, Object>> getValue() {
		return new ArrayList<>(this.value);
	}
	public void addProductToSiteB(int capacity, int price) {
		Map<String, Object> temp_nil = new HashMap<String, Object>();
		temp_nil.put("price",price);
		temp_nil.put("capacity",capacity);
		this.value.add(0, temp_nil);
	}
}