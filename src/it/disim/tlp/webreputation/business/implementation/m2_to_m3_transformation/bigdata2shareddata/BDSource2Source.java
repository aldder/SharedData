package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.bigdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.bigdata.BDSource;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class BDSource2Source implements Rule<BDSource, Source> {

	@Override
	public boolean check(BDSource source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Source build(BDSource source) {
		Source target = new Source(source.getName());
		return target;
	}
}
