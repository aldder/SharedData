package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.twittertweet2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.twittertweet.Tweet;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SocialData;

public class Tweet2SocialData implements Rule<Tweet,SocialData> {

	@Override
	public boolean check(Tweet source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SocialData build(Tweet source) {
		SocialData target = new SocialData(source.getText());
		return target;
	}
}
