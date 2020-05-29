package com.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calldetails.dto.CallDetailsDTO;
import com.calldetails.entity.CallDetails;
import com.calldetails.repository.CallDetailsRepository;
import com.calldetails.service.ICallDetailsService;

@Service
public class CallDetailsServiceImpl  implements ICallDetailsService{

	@Autowired
	private CallDetailsRepository repository;

	public List<CallDetailsDTO> readCallDetails(Long phoneNumber) {
		List<CallDetails> callDetailsList=repository.findByCalledFrom(phoneNumber);
		List<CallDetailsDTO> CallDetailsDtoList=new ArrayList<>();
		callDetailsList.forEach(callDetail ->{
			CallDetailsDTO dto=new CallDetailsDTO();
			BeanUtils.copyProperties(callDetail, dto);
			CallDetailsDtoList.add(dto);
		} );
		return CallDetailsDtoList;
	}
}
