package org.nercita.bigdata.domain;

import org.springframework.data.annotation.Id;

public class Solution {

	// Fields

	@Id private String id;
	private String name;
	private String description;

	// Property accessors

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}