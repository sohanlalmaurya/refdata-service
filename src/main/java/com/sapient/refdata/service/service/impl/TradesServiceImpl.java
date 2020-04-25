package com.sapient.refdata.service.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.refdata.service.entity.TradesEntity;
import com.sapient.refdata.service.mapper.TradesMapper;
import com.sapient.refdata.service.model.TradesModel;
import com.sapient.refdata.service.repository.TradesRepository;
import com.sapient.refdata.service.service.TradesService;

@Service
public class TradesServiceImpl implements TradesService {

	@Autowired
	private TradesRepository tradesRepository;
	
	@Autowired
	private TradesMapper tradesMapper;

	@Override
	public TradesModel save(TradesModel model) {

		TradesEntity entity = tradesRepository.save(tradesRepository.save(tradesMapper.toEntity(model)));
		return tradesMapper.toModel(entity);
	}

	@Override
	public TradesModel findById(Integer id) {

		return tradesMapper.toModel(tradesRepository.findById(id).get());
	}

	@Override
	public List<TradesModel> findAll() {
		
		return tradesRepository.findAll().stream().map(t -> tradesMapper.toModel(t)).collect(Collectors.toList());
	}

}
