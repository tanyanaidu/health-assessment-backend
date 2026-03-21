package com.example.demo.repository;

import com.example.demo.model.Assessment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssessmentRepository extends MongoRepository<Assessment, String> {
}