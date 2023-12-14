import java.util.List;
import java.util.Map;

public class SiteWrapper {
	private SiteA siteA;

	public SiteWrapper(SiteA siteA) {
		this.siteA = siteA;
	}

	public List<Map<String, Object>> getSiteValue(){
		return this.siteA.getValue();
	}

	public void addProductToSiteA(int capacity, int price) {
		this.siteA.addProductToSiteA(capacity, price);
	}
}
