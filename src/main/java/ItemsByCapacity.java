import java.util.*;

public class ItemsByCapacity {
	private Capacity capacity;
	private SiteWrapper SiteWrapper;
	public ItemsByCapacity(Capacity capacity, SiteWrapper SiteWrapper) {
		this.capacity = capacity;
		this.SiteWrapper = SiteWrapper;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.SiteWrapper.getSiteAValue()) {
				if ((Integer) item.get("capacity") >= this.capacity.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}