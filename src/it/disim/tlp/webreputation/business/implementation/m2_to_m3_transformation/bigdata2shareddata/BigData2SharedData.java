package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.bigdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.bigdata.BigData;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class BigData2SharedData implements Rule<BigData, Data> {

	@Override
	public boolean check(BigData source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Data build(BigData source) {
		Data target = new Data(source.getText());
		return target;
	}
}
