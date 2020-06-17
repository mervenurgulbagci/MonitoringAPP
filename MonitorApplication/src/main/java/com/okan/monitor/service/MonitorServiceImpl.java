package com.okan.monitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.okan.monitor.dao.MonitorDAO;
import com.okan.monitor.domain.Services;

@Service
public class MonitorServiceImpl implements MonitorService{

	@Autowired
	private MonitorDAO monitorDao; 
	
	@Transactional
	@Override
	public List<Services> getServices() {
		return monitorDao.getServices();
	}

	@Transactional
	@Override
	public void saveDown(Services services) {
		monitorDao.saveDown(services);
		
	}

	@Transactional
	@Override
	public void saveUp(Services services) {
		monitorDao.saveUp(services);
		
	}

}
