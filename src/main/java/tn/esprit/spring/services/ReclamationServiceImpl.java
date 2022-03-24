package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Notifications;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.repositories.ReclamationRepository;
@Service
public class ReclamationServiceImpl implements IServiceReclamation {
@Autowired
ReclamationRepository reclamationRepository; 
	@Override
	public List<Reclamation> retrieveAllReclamation() {
		return (List<Reclamation>) reclamationRepository.findAll();
	}

	@Override
	public Reclamation addReclamation(Reclamation r) {
		return reclamationRepository.save(r) ;
	}

	@Override
	public void deleteReclamation(int id) {
		reclamationRepository.deleteById(id);

	}

	@Override
	public Reclamation updateReclamation(Reclamation r) {
		return reclamationRepository.save(r);
	}

	@Override
	public Reclamation retrieveReclamation(int id) {
		Reclamation rec  = reclamationRepository.findById(id).get();
		return rec;		
	}

}