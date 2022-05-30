package mostafa.ahmed.eventmanager.service;

import mostafa.ahmed.eventmanager.model.Event;
import mostafa.ahmed.eventmanager.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void saveEvent(Event event) {
        this.eventRepository.save(event);
    }

}
