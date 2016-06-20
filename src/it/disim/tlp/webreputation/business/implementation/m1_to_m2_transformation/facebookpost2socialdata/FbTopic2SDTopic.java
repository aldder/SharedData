package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.facebookpost2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.facebookpost.FbTopic;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDTopic;

public class FbTopic2SDTopic implements Rule<FbTopic,SDTopic>{

	@Override
	public boolean check(FbTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SDTopic build(FbTopic source) {
		SDTopic target = new SDTopic(source.getTopic());
		return target;
	}
}
