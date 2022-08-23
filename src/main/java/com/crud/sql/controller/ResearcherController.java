package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Researcher;
import com.crud.sql.service.ResearcherServiceImpl;

@RestController
@RequestMapping("/api")
public class ResearcherController {
	
	@Autowired
	ResearcherServiceImpl researcherServiceImpl;
	
	@GetMapping("/researchers")
	public List<Researcher> listFaculties(){
		return researcherServiceImpl.listResearchers();		
	}
	
	@PostMapping("/researchers")
	public Researcher saveResearcher(@RequestBody Researcher researcher) {
		return researcherServiceImpl.saveResearcher(researcher);
	}
	
	@GetMapping("/researchers/{id}")
	public Researcher researcherXID(@PathVariable(name="id") int id) {
		Researcher researcher_xid = new Researcher();
		researcher_xid = researcherServiceImpl.researcherXID(id);
		return researcher_xid;
	}
	
	@PutMapping("/researchers/{id}")
	public Researcher updateFaculty(@PathVariable(name="id")int id,@RequestBody Researcher researcher) {
		Researcher researcher_selected = new Researcher();
		Researcher researcher_updated = new Researcher();
		
		researcher_selected = researcherServiceImpl.researcherXID(id);		
		researcher_selected.setDni(researcher.getDni());
		
		researcher_updated = researcherServiceImpl.updateResearcher(researcher_selected);
		return researcher_updated;
	}
	
	@DeleteMapping("/researchers/{id}")
	public void eliminateResearcher(@PathVariable(name="id") int id) {
		researcherServiceImpl.eliminateResearcher(id);
	}

}
