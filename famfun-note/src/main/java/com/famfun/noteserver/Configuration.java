package com.famfun.noteserver;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@ConfigurationProperties("limites")
public class Configuration {
	private int minimum;
	private int maximum;	

	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		System.out.println("xxxxxxxxxxxxxxxxx");
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
