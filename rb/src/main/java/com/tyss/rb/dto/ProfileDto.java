package com.tyss.rb.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProfileDto {

	private String firstName;
	private String lastName;
	private List<String> technology;
	private String totalExperience;
	private String relevantExperience;
	private List<SummaryDto> summaryDtos;
	private SkillsDto skillsDto;
	private List<EducationDetailsDto> educationDetailsListDto;
	private List<ProjectDetailsDto> projectDetailsDto;
	private AchievementDetailsDto achievementDetailsDto;

}
