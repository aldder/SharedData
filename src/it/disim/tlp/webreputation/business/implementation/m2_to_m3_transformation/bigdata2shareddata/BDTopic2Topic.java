package it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.bigdata2shareddata;

import it.disim.tlp.webreputation.business.implementation.Rule;
import it.disim.tlp.webreputation.business.model.m2.bigdata.BDTopic;
import it.disim.tlp.webreputation.business.model.m3.shareddata.Topic;

public class BDTopic2Topic implements Rule<BDTopic, Topic> {

	@Override
	public boolean check(BDTopic source) {
		return source.getClass() instanceof Class;
	}

	@Override
	public Topic build(BDTopic source) {
		Topic target = new Topic(source.getTopic());
		return target;
	}
}
