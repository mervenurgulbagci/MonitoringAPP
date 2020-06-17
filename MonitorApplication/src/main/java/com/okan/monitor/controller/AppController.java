package com.okan.monitor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.okan.monitor.domain.Services;
import com.okan.monitor.service.MonitorService;

@Controller
public class AppController {
	
	@Autowired
	private MonitorService monitorService;
	
	static RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/monitor") 
	public String deneme(Model model) {
			
		System.out.println("service check started");
		List<Services> services = monitorService.getServices();
		List<Services> ups= new ArrayList<>();
		List<Services> downs= new ArrayList<>();
		for (Services services2 : services){ 
		try {
				String kontrol =restTemplate.getForObject(services2.getAddress(), String.class);
				ups.add(services2);
				monitorService.saveUp(services2);
				System.out.println(services2+" is up");
			}
		 catch (RestClientException e) {
			 downs.add(services2);
			 monitorService.saveDown(services2);
			System.out.println(services2+" is down");
		}
		}
		System.out.println("service check finished\n\n");
		model.addAttribute("ups", ups);
		model.addAttribute("downs", downs);
//		String deneme = restTemplate.getForObject(services.get(0).getAddress(), String.class);
//		System.out.println(services.get(0).getAddress()+" için "+deneme);
		
		return "home";
		
	}

}
