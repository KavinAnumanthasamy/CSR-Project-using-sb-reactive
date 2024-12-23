package com.ust.EventService.Entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Data
public class Event {
    @Id
    public long eventId;
    public String eventname;
    public String date;
    
}
