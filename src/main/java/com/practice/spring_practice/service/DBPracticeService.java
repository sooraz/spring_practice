package com.practice.spring_practice.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring_practice.entity.DBPracticeEntity;
import com.practice.spring_practice.repository.PracticeJPAReposirtory;

@Service
public class DBPracticeService {
	@Autowired
	PracticeJPAReposirtory repo;
	
	Logger logger = LogManager.getLogger(DBPracticeService.class);

	public List<DBPracticeEntity> getData() {
		return repo.findAll();
	}
	
	public int setData(DBPracticeEntity data) {
		logger.debug("data in is "+data);
		return repo.save(data).getId();
	}

	public DBPracticeEntity getDataForId(int id) {
		return repo.findById(id).get();
	}
}
