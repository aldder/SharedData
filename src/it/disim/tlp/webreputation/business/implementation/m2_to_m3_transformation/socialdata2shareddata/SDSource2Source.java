package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.socialdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDSource;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class SDSource2Source implements Rule<SDSource, Source> {

	@Override
	public boolean check(SDSource source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Source build(SDSource source) {
		Source target = new Source(source.getName());
		return target;
	}
}
