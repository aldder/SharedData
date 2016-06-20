package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.opendata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.opendata.ODSource;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class ODSource2Source implements Rule<ODSource, Source> {

	@Override
	public boolean check(ODSource source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Source build(ODSource source) {
		Source target = new Source(source.getName());
		return target;
	}
}
