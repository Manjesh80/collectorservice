package com.manjesh.collector.services;

import com.manjesh.collector.domain.Event;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 2/17/2017.
 */

@RestController
@RequestMapping("/event")
public class EventService {

    @RequestMapping( value = "{eventID}")
    public Event getEvent(@PathVariable int eventID) {
        return new Event(eventID, "Ganesh", "Network 100");
    }
}
