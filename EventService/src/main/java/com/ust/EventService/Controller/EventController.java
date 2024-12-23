package com.ust.EventService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EventService.Entity.Event;
import com.ust.EventService.Service.EventService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired EventService service;

    @PostMapping("/addevent")
    public Mono<Event> addevent(@RequestBody Event event){
        return service.addEvent(event);
    }

    @GetMapping("/getallevent")
    public Flux<Event> getallEvent(){
        return service.getallEvent();
    }
    
}
