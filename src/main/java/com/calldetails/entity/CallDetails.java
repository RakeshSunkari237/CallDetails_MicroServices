package com.calldetails.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CallDetails {

	@Id
	private Long callId;
	@NonNull
	private Long calledFrom;
	@NonNull
	private Long calledTo;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date calledOn;
	@NonNull
	private Long durationInSec;

}
