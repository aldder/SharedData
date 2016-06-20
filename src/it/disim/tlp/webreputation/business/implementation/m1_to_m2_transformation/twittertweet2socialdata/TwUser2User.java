package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.twittertweet2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.twittertweet.TwUser;
import it.disim.tlp.webreputation.business.model.m2.socialdata.User;

public class TwUser2User implements Rule<TwUser, User> {

	@Override
	public boolean check(TwUser source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public User build(TwUser source) {
		User target = new User(source.getName(), source.getCognome());
		return target;
	}
}