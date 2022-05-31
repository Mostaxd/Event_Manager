package mostafa.ahmed.eventmanager.service;

import mostafa.ahmed.eventmanager.model.Event;
import mostafa.ahmed.eventmanager.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override //Java 8 code, Optional Object
    public Event getEventById(long id) {
        Optional<Event> optional = eventRepository.findById(id);
        Event event;
        if (optional.isPresent() == false){
            throw new RuntimeException("Event not found for id : " + id);
        }
        else
            event = optional.get();
            return event;
    }

    @Override
    public void deleteEventById(long id) {
        eventRepository.deleteById(id);
    }


}
