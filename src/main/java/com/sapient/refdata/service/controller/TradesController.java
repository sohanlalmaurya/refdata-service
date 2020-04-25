/**
 * 
 */
package com.sapient.refdata.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.refdata.service.model.TradesModel;
import com.sapient.refdata.service.service.TradesService;

/**
 * @author Sohan
 *
 */

@RestController
public class TradesController {

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
	public ResponseEntity<List<TradesModel>> getTrades() {

		return ResponseEntity.ok(tradesService.findAll());
	}
}
