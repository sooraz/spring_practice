package com.practice.spring_practice.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.practice.spring_practice.entity.DBPracticeEntity;

@Repository
public class RedisPracticeRepository {
	private final String hashReference= "DBPracticeEntity";

    @Resource(name="redisTemplate")
    private HashOperations<String, Integer, DBPracticeEntity> hashOperations;

	public List<DBPracticeEntity> getData() {
		// TODO Auto-generated method stub
		return (List<DBPracticeEntity>) hashOperations.entries(hashReference).values();
	}

	public DBPracticeEntity getDataForId(int id) {
		// TODO Auto-generated method stub
		return hashOperations.get(hashReference, id);
	}

	public DBPracticeEntity setData(DBPracticeEntity data) {
		// TODO Auto-generated method stub
		hashOperations.putIfAbsent(hashReference, data.getId(), data);
		return hashOperations.get(hashReference, data.getId());
	}
}
