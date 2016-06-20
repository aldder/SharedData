package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.facebookpost2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.facebookpost.Facebook;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDSource;

public class Facebook2SDSource implements Rule<Facebook, SDSource> {

	@Override
	public boolean check(Facebook source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SDSource build(Facebook source) {
		SDSource target = new SDSource(source.getName());
		return target;
	}
}
