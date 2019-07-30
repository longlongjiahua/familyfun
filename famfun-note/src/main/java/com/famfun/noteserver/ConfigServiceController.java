package com.famfun.noteserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServiceController {

	@Autowired
	private Configuration configuration;


	@GetMapping("/limits")
	public String getConfiguracion()
	{
		return "" + configuration.getMinimum() + 
				configuration.getMaximum();
	}
	
}