package com.practice.spring_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.spring_practice.entity.DBPracticeEntity;

@Repository
public interface PracticeJPAReposirtory extends JpaRepository<DBPracticeEntity, Integer>{

}
