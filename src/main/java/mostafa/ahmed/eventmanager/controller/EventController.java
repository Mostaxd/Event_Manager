package mostafa.ahmed.eventmanager.controller;

import mostafa.ahmed.eventmanager.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    // create method handler to show list of employees on homepage
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEvents",eventService.getAllEvents());
        return "index";
    }

}
