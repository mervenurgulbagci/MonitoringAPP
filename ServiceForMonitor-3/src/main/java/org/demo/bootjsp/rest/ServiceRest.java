package org.demo.bootjsp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRest {
	
	@GetMapping("/isup")
	public String isup() {
		return "1";
	}
}
