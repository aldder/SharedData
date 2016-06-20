package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.twittertweet2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.twittertweet.TwTopic;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDTopic;

public class TwTopic2SDTopic implements Rule<TwTopic,SDTopic>{

	@Override
	public boolean check(TwTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SDTopic build(TwTopic source) {
		SDTopic target = new SDTopic(source.getTopic());
		return target;
	}
}
