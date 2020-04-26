/**
 * 
 */
package com.sapient.refdata.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sapient.refdata.service.model.TradesModel;
import com.sapient.refdata.service.service.TradesService;

/**
 * @author Sohan
 *
 */

@RestController
public class TradesController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TradesService tradesService;

	@PostMapping("/trades")
	public ResponseEntity<TradesModel> createTrades(@RequestBody TradesModel model) {

		return ResponseEntity.ok(tradesService.save(model));
	}

	@GetMapping("/trades/{id}")
	public ResponseEntity<TradesModel> getTrades(@PathVariable Integer id) {

		return ResponseEntity.ok(tradesService.findById(id));
	}

	@GetMapping("/trades")
	@HystrixCommand(fallbackMethod = "fallbackGetTrades()")
	public ResponseEntity<List<TradesModel>> getTrades() {
		logger.info("{}", "test------------>>>>>>>>");
		return ResponseEntity.ok(tradesService.findAll());
	}
	
	
	public ResponseEntity<List<TradesModel>> fallbackGetTrades() {
		logger.info("{}", "test------------>>>>>>>>");
		return ResponseEntity.ok(new ArrayList<TradesModel>());
	}
}
