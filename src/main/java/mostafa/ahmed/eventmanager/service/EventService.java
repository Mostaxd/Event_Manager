package mostafa.ahmed.eventmanager.service;

import mostafa.ahmed.eventmanager.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    void saveEvent(Event event);
    Event getEventById(long id);
    void updateEvent(Event event);
}