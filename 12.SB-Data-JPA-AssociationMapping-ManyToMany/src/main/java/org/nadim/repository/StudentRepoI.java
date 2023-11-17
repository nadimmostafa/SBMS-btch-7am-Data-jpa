package org.nadim.repository;

import org.nadim.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepoI extends JpaRepository<Student, Integer> {

}
