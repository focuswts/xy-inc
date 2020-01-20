package com.point.pichallenge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.point.pichallenge.entity.PI;
import com.point.pichallenge.repository.PIRepository;

@RestController
public class PIController {

	@Autowired
	private PIRepository piService;

	@RequestMapping(value = "/pi/all", method = RequestMethod.GET)
	public Iterable<PI> getAllPI() {
		System.out.println("Get ALl PI API");
		return piService.findAll();
	}

	@RequestMapping(value = "/pi/create", method = RequestMethod.POST)
	public PI createPI(@Valid @RequestBody PI pi) {
		pi.setCordCalculated(pi.getCordCalculated(pi.getCordX(), pi.getCordY()));

		return piService.save(pi);

	}

	@RequestMapping(value = "/pi/getNextPI", method = RequestMethod.POST)
	public Iterable<PI> listNextPI(@Valid @RequestBody PI pi) {
		
		System.out.println(" NEXT PI: "+ piService.findAllNextPI(pi.getCordCalculated(pi.getCordX(), pi.getCordY())));
		return piService.findAllNextPI(pi.getCordCalculated(pi.getCordX(), pi.getCordY()));

	}

}
