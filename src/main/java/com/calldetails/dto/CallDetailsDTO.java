package com.calldetails.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class CallDetailsDTO {

	@GeneratedValue
	private Long callId;
	@NonNull
	private Long calledFrom;
	@NonNull
	private Long calledTo;
	@NonNull
	private Date calledOn;
	@NonNull
	private Long durationInSec;
	

}
