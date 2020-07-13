package conference.service;

import java.util.List;

import conference.model.Speaker;
import conference.repository.HibernateSpeakerRepositoryImpl;
import conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
