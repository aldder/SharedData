package it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.facebookpost2socialdata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m1.facebookpost.FbPost;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SocialData;

public class FbPost2SocialData implements Rule<FbPost,SocialData> {

	@Override
	public boolean check(FbPost source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public SocialData build(FbPost source) {
		SocialData target = new SocialData(source.getText());
		return target;
	}
}
