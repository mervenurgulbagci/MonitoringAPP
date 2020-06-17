package com.okan.monitor.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.okan.monitor.domain.Downservices;
import com.okan.monitor.domain.Services;
import com.okan.monitor.domain.Upservices;

@Repository
public class MonitorDAOImpl implements MonitorDAO {
	
	private EntityManager entityManager;
	

	@Autowired
	public MonitorDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public List<Services> getServices() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Services> theQuery =
				currentSession.createQuery("from Services", Services.class);
		
		// execute query and get result list
		List<Services> services = theQuery.getResultList();
		return services;
	}


	@Override
	public void saveDown(Services services) {
		Session currentSession = entityManager.unwrap(Session.class);
		Downservices downS= new Downservices(services.getName(), services.getAddress(), new java.util.Date());
		currentSession.save(downS);
		
	}


	@Override
	public void saveUp(Services services) {
		Session currentSession = entityManager.unwrap(Session.class);
		Upservices upS= new Upservices(services.getName(), services.getAddress(), new java.util.Date());
		currentSession.save(upS);
		
	}

}
