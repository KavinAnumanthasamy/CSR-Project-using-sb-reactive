package com.ust.SchoolService.Repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.SchoolService.Entity.School;
@Repository
public interface SchoolRepo extends ReactiveMongoRepository<School,String>{
    
}
