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

import com.crud.sql.dto.Faculty;
import com.crud.sql.service.FacultyServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultyController {
	
	@Autowired
	FacultyServiceImpl facultyServiceImpl;
	
	@GetMapping("/faculties")
	public List<Faculty> listFaculties(){
		return facultyServiceImpl.listFaculties();		
	}
	
	@PostMapping("/faculties")
	public Faculty saveFaculty(@RequestBody Faculty faculty) {
		return facultyServiceImpl.saveFaculty(faculty);
	}
	
	@GetMapping("/faculties/{id}")
	public Faculty pieceXID(@PathVariable(name="id") int id) {
		Faculty faculty_xid = new Faculty();
		faculty_xid = facultyServiceImpl.facultyXID(id);
		return faculty_xid;
	}
	
	@PutMapping("/faculties/{id}")
	public Faculty updateFaculty(@PathVariable(name="id")int id,@RequestBody Faculty faculty) {
		Faculty faculty_selected = new Faculty();
		Faculty faculty_updated = new Faculty();
		
		faculty_selected = facultyServiceImpl.facultyXID(id);		
		faculty_selected.setName(faculty.getName());
		
		faculty_updated = facultyServiceImpl.updateFaculty(faculty_selected);
		return faculty_updated;
	}
	
	@DeleteMapping("/faculties/{id}")
	public void eliminatePiece(@PathVariable(name="id") int id) {
		facultyServiceImpl.eliminateFaculty(id);
	}

}
