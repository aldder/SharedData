package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.linkeddata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.linkeddata.LDTopic;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Topic;

public class LDTopic2Topic implements Rule<LDTopic, Topic> {

	@Override
	public boolean check(LDTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Topic build(LDTopic source) {
		Topic target = new Topic(source.getTopic());
		return target;
	}
}
