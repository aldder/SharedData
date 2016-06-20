package it.disim.tlp.webreputation.business.implementation;

import java.util.List;
import java.util.LinkedList;

public class Transformation implements Transformer {

	private Object element;
	private List<Object> elements;

	public Transformation(Object source, Rule rule) {
		this.element = transform(source, rule);
	}

	public Transformation(List<Object> source, Rule rule) {
		this.elements = transform(source, rule);
	}

	@Override
	public Object transform(Object source, Rule rule) {
		if (rule.check(source)) {
			Object target;
			target = rule.build(source);
			return target;
		}
		return null;
	}

	@Override
	public List<Object> transform(List source, Rule rule) {
		List<Object> target = new LinkedList();
		for (Object s : source) {
			if (rule.check(s)) {
				target.add(rule.build(s));
			}
		}
		return target;
	}

	public Object getElement() {
		return element;
	}

	public List<Object> getElements() {
		return elements;
	}
}
