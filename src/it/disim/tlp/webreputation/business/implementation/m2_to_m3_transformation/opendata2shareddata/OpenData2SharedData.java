package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.opendata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.opendata.OpenData;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class OpenData2SharedData implements Rule<OpenData, Data> {

	@Override
	public boolean check(OpenData source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Data build(OpenData source) {
		Data target = new Data(source.getText());
		return target;
	}
}
