import java.util.*;

public class ItemsByCapacity {
	private Capacity capacity;
    private SiteWrapper siteWrapper;
    public ItemsByCapacity(Capacity capacity, SiteWrapper siteWrapper) {
		this.capacity = capacity;
		this.siteWrapper = siteWrapper;
	}
	public List<Map<String, Object>> getValue() {
		List<Map<String, Object>> temp_l1 = new ArrayList<>();
		{
			for (Map<String, Object> item: this.siteWrapper.getSiteValue()) {
				if ((Integer) item.get("capacity") >= this.capacity.getValue()) {
					temp_l1.add(item);
				}
			}
		}
		return temp_l1;
	}
}