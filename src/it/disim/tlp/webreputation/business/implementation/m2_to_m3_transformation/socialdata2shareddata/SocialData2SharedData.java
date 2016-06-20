package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.socialdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SocialData;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class SocialData2SharedData implements Rule<SocialData, Data> {

	@Override
	public boolean check(SocialData source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Data build(SocialData source) {
		Data target = new Data(source.getText());
		return target;
	}
}
