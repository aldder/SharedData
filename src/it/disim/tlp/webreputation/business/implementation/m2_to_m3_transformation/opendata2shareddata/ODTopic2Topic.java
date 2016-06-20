package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.opendata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.opendata.ODTopic;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Topic;

public class ODTopic2Topic implements Rule<ODTopic, Topic> {

	@Override
	public boolean check(ODTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Topic build(ODTopic source) {
		Topic target = new Topic(source.getTopic());
		return target;
	}
}
