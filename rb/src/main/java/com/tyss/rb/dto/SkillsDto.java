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
public class SkillsDto {
	private List<String> frontEndTech;
	private List<String> backEndTech;
	private List<String> middlewareTech;
	private List<String> designPatterns;
	private List<String> skillDatabases;
	private List<String> versionControlSys;
	private List<String> aws;
	private List<String> sdlc;
	private List<String> developmentTools;

}
