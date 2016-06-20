package it.disim.tlp.webreputation.business.implementation;


public interface Rule <S,T> {

	boolean check(S source);
	T build(S source);
}
