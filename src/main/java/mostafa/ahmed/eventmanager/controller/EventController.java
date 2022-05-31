package mostafa.ahmed.eventmanager.controller;

import mostafa.ahmed.eventmanager.model.Event;
import mostafa.ahmed.eventmanager.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    // create method handler to show list of events on homepage
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEvents",eventService.getAllEvents());
        return "index";
    }

    @GetMapping("/showNewEventForm")
    public String showNewEventForm(Model model){
        Event event = new Event();
        model.addAttribute("event",event);
        return "new_event";
    }

    @PostMapping("/saveEvent")
    public String saveEvent(@ModelAttribute("event") Event event){
        eventService.saveEvent(event);
        return "redirect:/";
    }


    @GetMapping("/showUpdateEventForm/{id}")
    public String showUpdateEventForm(@PathVariable (value = "id") long id, Model model){
        Event event = eventService.getEventById(id);
        model.addAttribute("event",event);
        return "update_event";
    }



}
