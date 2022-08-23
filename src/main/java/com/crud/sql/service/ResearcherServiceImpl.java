package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IResearcherDAO;
import com.crud.sql.dto.Researcher;

@Service
public class ResearcherServiceImpl implements IResearcherService{

		@Autowired
		IResearcherDAO iReseracherDAO;

		@Override
		public List<Researcher> listResearchers() {
			// TODO Auto-generated method stub
			return iReseracherDAO.findAll();
		}

		@Override
		public Researcher saveResearcher(Researcher research) {
			// TODO Auto-generated method stub
			return iReseracherDAO.save(research);
		}

		@Override
		public Researcher researcherXID(int id) {
			// TODO Auto-generated method stub
			return iReseracherDAO.findById(id).get();
		}

		@Override
		public Researcher updateResearcher(Researcher research) {
			// TODO Auto-generated method stub
			return iReseracherDAO.save(research);
		}

		@Override
		public void eliminateResearcher(int id) {
			// TODO Auto-generated method stub
			iReseracherDAO.deleteById(id);
		}
		
		
}
