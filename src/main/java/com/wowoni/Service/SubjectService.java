package com.wowoni.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wowoni.Repository.SubjectRepository;
import com.wowoni.entity.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

	public Subject createSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	public Optional<Subject> getSubjectById(long id) {
		return subjectRepository.findById(id);
	}

	public List<Subject> getAll() {
		return subjectRepository.findAll();
	}

	public void deleteById(long id) {
		subjectRepository.deleteById(id);
	}
}
