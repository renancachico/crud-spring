package com.crud.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.spring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}