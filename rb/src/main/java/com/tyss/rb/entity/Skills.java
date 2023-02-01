package com.tyss.rb.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer skillsId;

	@ElementCollection
	@CollectionTable(name = "skills_front_end_tech", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> frontEndTech;

	@ElementCollection
	@CollectionTable(name = "skills_back_end_tech", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> backEndTech;

	@ElementCollection
	@CollectionTable(name = "skills_middleware_tech", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> middlewareTech;

	@ElementCollection
	@CollectionTable(name = "skills_design_patterns", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> designPatterns;

	@ElementCollection
	@CollectionTable(name = "skills_databases", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> skillDatabases;

	@ElementCollection
	@CollectionTable(name = "skills_version_control_system", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> versionControlSys;

	@ElementCollection
	@CollectionTable(name = "skills_aws", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> aws;

	@ElementCollection
	@CollectionTable(name = "skills_sdlc", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> sdlc;

	@ElementCollection
	@CollectionTable(name = "skills_development_tools", joinColumns = @JoinColumn(name = "skills_id"))
	private List<String> developmentTools;

}
