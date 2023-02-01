package com.tyss.rb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EducationDetailsDto {

	private String education;

	private String specialization;

	private String university;

	private Integer yop;

	private Double percentage;

}
