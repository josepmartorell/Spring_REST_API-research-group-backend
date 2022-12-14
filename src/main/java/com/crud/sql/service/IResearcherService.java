package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Researcher;

public interface IResearcherService {
	//CRUD methods
	public List<Researcher> listResearchers();	
	public Researcher saveResearcher(Researcher research);	
	public Researcher researcherXID(int id);
	public Researcher updateResearcher(Researcher research);	
	public void eliminateResearcher(int id);

}
