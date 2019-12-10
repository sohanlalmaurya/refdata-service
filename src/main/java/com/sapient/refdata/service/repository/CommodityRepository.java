package com.sapient.refdata.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.refdata.service.entity.CommodityEntity;

@Repository
public interface CommodityRepository extends JpaRepository<CommodityEntity, Integer>{

}
