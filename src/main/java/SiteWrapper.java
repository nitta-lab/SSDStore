import java.util.List;
import java.util.Map;

public class SiteWrapper {
	private SiteA siteA;
	private SiteB siteB;
	public SiteWrapper(SiteA siteA, SiteB siteB) {
		this.siteA = siteA;
		this.siteB = siteB;
	}
	public List<Map<String, Object>> getSiteValue() {
		List<Map<String, Object>> productList = this.siteA.getValue();
		productList.addAll(this.siteB.getValue());
		return productList;
	}
}