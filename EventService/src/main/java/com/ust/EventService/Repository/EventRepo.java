package com.ust.EventService.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ust.EventService.Entity.Event;

public interface EventRepo extends ReactiveMongoRepository<Event, String> {
    
}
