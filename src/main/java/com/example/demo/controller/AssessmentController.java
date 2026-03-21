package com.example.demo.controller;

import com.example.demo.model.Assessment;
import com.example.demo.service.AssessmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessments")
@CrossOrigin(origins = "*")
public class AssessmentController {
	
    @Autowired
    private final AssessmentService service;

    public AssessmentController(AssessmentService service) {
        this.service = service;
    }

    // ✅ SAVE DATA
    @PostMapping
    public Assessment save(@RequestBody Assessment assessment) {
        return service.saveAssessment(assessment);
    }

    // ✅ GET ALL DATA
    @GetMapping
    public List<Assessment> getAll() {
        return service.getAll();
    }
}