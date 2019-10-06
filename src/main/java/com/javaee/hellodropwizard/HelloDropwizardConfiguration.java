package com.javaee.hellodropwizard;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class HelloDropwizardConfiguration extends Configuration {
    // TODO: implement service configuration
	
	@NotEmpty
	private String message;

	@JsonProperty
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
