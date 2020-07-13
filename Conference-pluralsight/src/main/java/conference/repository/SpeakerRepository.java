package conference.repository;

import java.util.List;

import conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}