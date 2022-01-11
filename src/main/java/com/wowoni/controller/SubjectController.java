package com.wowoni.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowoni.Service.SubjectService;
import com.wowoni.entity.Subject;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	SubjectService subjectService;

	@PostMapping("/create")
	public Subject createSubject(@RequestBody Subject subject) {
		return subjectService.createSubject(subject);
	}

	@GetMapping("/get/{id}")
	public Optional<Subject> getbyid(@PathVariable long id) {
		return subjectService.getSubjectById(id);
	}

	@GetMapping("/all")
	public List<Subject> getAll() {
		return subjectService.getAll();
	}

	@DeleteMapping("/delete")
	public String deleteById(long id) {
		subjectService.deleteById(id);
		return "Deleted..............";
	}
}
