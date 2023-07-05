package com.practice.spring_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring_practice.entity.DBPracticeEntity;
import com.practice.spring_practice.repository.RedisPracticeRepository;

@Service
public class RedisPracticeService {
	
	@Autowired
	RedisPracticeRepository repo;

	public List<DBPracticeEntity> getData() {
		return repo.getData();
	}

	public DBPracticeEntity getDataForId(int id) {
		return repo.getDataForId(id);
	}

	public int setData(DBPracticeEntity data) {
		// TODO Auto-generated method stub
		return repo.setData(data).getId();
	}

}
