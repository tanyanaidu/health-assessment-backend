package com.example.demo.service;

import com.example.demo.model.Assessment;
import com.example.demo.repository.AssessmentRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private final AssessmentRepository repository;

    public AssessmentService(AssessmentRepository repository) {
        this.repository = repository;
    }

    public Assessment saveAssessment(Assessment assessment) {
    	System.out.println("Saving to DB : "+assessment);
        return repository.save(assessment);
    }

    public List<Assessment> getAll() {
        return repository.findAll();
    }
}