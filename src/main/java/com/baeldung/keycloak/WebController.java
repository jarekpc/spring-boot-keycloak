package com.baeldung.keycloak;

import com.baeldung.keycloak.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class WebController {

    private final EventsRepository eventsRepository;

    public WebController(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        Iterable<Events> events = eventsRepository.findAll();
        model.addAttribute("events", events);
        model.addAttribute("username", principal.getName());
        return "customers";
    }

    @GetMapping("/check")
    public String checkLogin(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "check";
    }


}
