package conference.repository;

import java.util.ArrayList;
import java.util.List;

import conference.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	
	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speakers.add(speaker);
		return speakers; 
	}

}
