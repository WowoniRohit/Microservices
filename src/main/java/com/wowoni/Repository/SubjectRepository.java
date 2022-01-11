package com.wowoni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowoni.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
