package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.twittertweet2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.twittertweet.Twitter;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDSource;

public class Twitter2SDSource implements Rule<Twitter, SDSource> {

	@Override
	public boolean check(Twitter source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SDSource build(Twitter source) {
		SDSource target = new SDSource(source.getName());
		return target;
	}
}
