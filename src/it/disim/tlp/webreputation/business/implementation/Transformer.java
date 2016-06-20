package it.disim.tlp.webreputation.business.implementation;

import java.util.List;

public interface Transformer <T,S> {

	Object transform(Object source, Rule<T,S> rule);
	List<Object> transform(List<Object> source, Rule<T,S> rule);
}
