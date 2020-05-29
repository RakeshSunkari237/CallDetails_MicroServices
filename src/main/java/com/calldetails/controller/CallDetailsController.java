package com.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.calldetails.dto.CallDetailsDTO;
import com.calldetails.service.ICallDetailsService;

@RestController
public class CallDetailsController {

	@Autowired
	private ICallDetailsService service;
	
	@GetMapping("call/{phoneNumber}")
	public List<CallDetailsDTO> getCallDetails(@PathVariable Long phoneNumber){
		List<CallDetailsDTO> callDetails = service.readCallDetails(phoneNumber);
		return callDetails;
	}
}
