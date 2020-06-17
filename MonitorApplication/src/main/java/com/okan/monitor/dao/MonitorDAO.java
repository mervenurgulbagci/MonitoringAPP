package com.okan.monitor.dao;

import java.util.List;

import com.okan.monitor.domain.Services;

public interface MonitorDAO {

	List<Services> getServices();

	void saveDown(Services services);

	void saveUp(Services services);

}
