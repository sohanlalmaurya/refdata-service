package com.sapient.refdata.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.refdata.service.entity.TradesEntity;

@Repository
public interface TradesRepository extends JpaRepository<TradesEntity, Integer>{

}
