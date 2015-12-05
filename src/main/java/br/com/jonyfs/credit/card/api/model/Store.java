package br.com.jonyfs.credit.card.api.model;

import javax.validation.constraints.NotNull;

public class Store extends BaseDocument<Long> {

	@NotNull
	private String name;

	public Store(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}