package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.facebookpost2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.facebookpost.FbUser;
import it.disim.tlp.webreputation.business.model.m2.socialdata.User;

public class FbUser2User implements Rule<FbUser, User> {

	@Override
	public boolean check(FbUser source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public User build(FbUser source) {
		User target = new User(source.getName(), source.getCognome());
		return target;
	}
}