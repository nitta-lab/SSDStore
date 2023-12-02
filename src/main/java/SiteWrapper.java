import java.util.*;

public class SiteWrapper {
	private SiteA siteA;
	public SiteWrapper(SiteA siteA) {
		this.siteA = siteA;
	}
	public List<Map<String, Object>> getSiteAValue() {
		return this.siteA.getValue();
	}
}