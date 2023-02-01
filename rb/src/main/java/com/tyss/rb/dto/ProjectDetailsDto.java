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
public class ProjectDetailsDto {
	private List<String> projectFrontEndTech;
	private List<String> projectBackEndTech;
	private List<String> projectDesignPatterns;
	private List<String> projectDatabases;
	private List<String> projectDevlopmentTools;
	private String projectDuration;
	private Integer projectTeamSize;
	private String projectDescription;
	private String projectRolesAndResponsibilities;

}
