package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.socialdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.socialdata.SDTopic;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Topic;

public class SDTopic2Topic implements Rule<SDTopic, Topic> {

	@Override
	public boolean check(SDTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Topic build(SDTopic source) {
		Topic target = new Topic(source.getTopic());
		return target;
	}
}
