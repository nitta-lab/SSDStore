import java.util.*;

public class ItemsByCapacity {
	private Capacity capacity;
	private SiteA siteA;
	public ItemsByCapacity(Capacity capacity, SiteA siteA) {
		this.capacity = capacity;
		this.siteA = siteA;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.siteA.getValue()) {
				if ((Integer) item.get("capacity") >= this.capacity.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}