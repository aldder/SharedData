package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.linkeddata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.linkeddata.LinkedData;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class LinkedData2SharedData implements Rule<LinkedData, Data> {

	@Override
	public boolean check(LinkedData source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Data build(LinkedData source) {
		Data target = new Data(source.getText());
		return target;
	}
}
