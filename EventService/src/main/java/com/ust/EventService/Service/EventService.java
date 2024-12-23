package com.ust.EventService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EventService.Entity.Event;
import com.ust.EventService.Repository.EventRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    @Autowired EventRepo repository;


    public Mono<Event> addEvent(Event event){
        return repository.save(event);
    }

    public Flux<Event> getallEvent(){
        return repository.findAll();
    }
}
