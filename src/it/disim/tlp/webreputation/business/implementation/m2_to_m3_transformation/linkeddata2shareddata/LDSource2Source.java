package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.linkeddata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.linkeddata.LDSource;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class LDSource2Source implements Rule<LDSource, Source> {

	@Override
	public boolean check(LDSource source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Source build(LDSource source) {
		Source target = new Source(source.getName());
		return target;
	}
}
