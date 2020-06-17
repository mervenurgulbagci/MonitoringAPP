package com.okan.monitor.service;

import java.util.List;

import com.okan.monitor.domain.Services;

public interface MonitorService {

	List<Services> getServices();

	void saveDown(Services services2);

	void saveUp(Services services2);

}
