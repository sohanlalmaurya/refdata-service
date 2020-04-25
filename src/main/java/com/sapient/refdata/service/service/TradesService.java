package com.sapient.refdata.service.service;

import java.util.List;

import com.sapient.refdata.service.model.TradesModel;

public interface TradesService {
	
	public TradesModel save(TradesModel model);
	
	public TradesModel findById(Integer id);
	
	public List<TradesModel> findAll();
}
