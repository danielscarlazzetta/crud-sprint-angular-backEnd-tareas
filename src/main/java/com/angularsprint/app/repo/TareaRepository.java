package com.angularsprint.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.angularsprint.app.model.Tarea;

public interface TareaRepository extends MongoRepository<Tarea, String>{

}
