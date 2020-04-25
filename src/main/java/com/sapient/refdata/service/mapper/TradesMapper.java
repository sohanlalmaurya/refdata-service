package com.sapient.refdata.service.mapper;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.refdata.service.entity.TradesEntity;
import com.sapient.refdata.service.model.TradesModel;
import com.sapient.refdata.service.repository.CommodityRepository;
import com.sapient.refdata.service.repository.CounterpartyRepository;
import com.sapient.refdata.service.repository.LocationRepository;

@Component
public class TradesMapper {
	
	@Autowired
	private CommodityRepository commodityRepository;
	
	@Autowired 
	private CounterpartyRepository counterpartyRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	public TradesModel toModel(TradesEntity entity) {
		if(Objects.isNull(entity))
			return null;
		TradesModel model = new TradesModel();
		model.setTradeId(entity.getTradeId());
		model.setSide(entity.getSide());
		model.setQuantity(entity.getQuantity());
		model.setPrice(entity.getPrice());
		model.setStatus(entity.getStatus());
		TradesModel.CommodityModel commodity = new TradesModel.CommodityModel();
		commodity.setId(entity.getCommodityId().getId());
		commodity.setName(entity.getCommodityId().getName());
		model.setCommodity(commodity);
		TradesModel.CounterpartyModel counterparty = new TradesModel.CounterpartyModel();
		counterparty.setId(entity.getCounterpartyId().getId());
		counterparty.setName(entity.getCounterpartyId().getName());
		model.setCounterparty(counterparty);
		TradesModel.LocationModel location = new TradesModel.LocationModel();
		location.setId(entity.getLocationId().getId());
		location.setName(entity.getLocationId().getName());
		model.setLocation(location);
		return model;
	}
	
	public TradesEntity toEntity(TradesModel model) {
		if(Objects.isNull(model))
			return null;
		TradesEntity entity = new TradesEntity();
		entity.setSide(model.getSide());
		entity.setQuantity(model.getQuantity());
		entity.setPrice(model.getPrice());
		entity.setStatus(model.getStatus());
		entity.setCommodityId(commodityRepository.findById(model.getCommodity().getId()).get());
		entity.setCounterpartyId(counterpartyRepository.findById(model.getCommodity().getId()).get());
		entity.setLocationId(locationRepository.findById(model.getLocation().getId()).get());
		return entity;
	}
}
