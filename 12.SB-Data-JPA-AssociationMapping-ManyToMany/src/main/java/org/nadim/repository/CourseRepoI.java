package org.nadim.repository;

import org.nadim.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepoI extends JpaRepository<Course, Integer> {

}
